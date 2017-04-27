package org.sun.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Mr.sun on 2017/3/23.
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public ErrorInfo customErrorHandler(HttpServletRequest req, CustomException e) throws Exception {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setUrl(req.getRequestURL().toString());
        errorInfo.setType(e.getClass().getName());
        errorInfo.setCode(e.getExceptionCode());
        errorInfo.setMessage(e.getExceptionMsg());
        e.printStackTrace();
        return errorInfo;
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ErrorInfo errorInfo = new ErrorInfo();

        errorInfo.setType(e.getClass().getName());
        errorInfo.setUrl(req.getRequestURL().toString());
        errorInfo.setCode(ErrorCode.CODE_100);
        StackTraceElement[] st = e.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : st) {
            String exclass = stackTraceElement.getClassName();
            if (exclass.contains("com.chinasoft")) {
                String method = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                sb.append("{'class:" + exclass + "','line:" + lineNumber + "','method:" + method + "'}");
            }
        }
        String errorMsg = sb.toString();
        if (errorMsg.isEmpty())
            errorInfo.setMessage(e.getMessage());
        else
            errorInfo.setMessage(sb.toString());
        e.printStackTrace();

        return errorInfo;
    }
}
