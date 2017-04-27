package web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Mr.sun on 2017/3/23.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    public static final String CUSTOM_ERROR_VIEW = "custom_error";

    @ExceptionHandler(value = CustomException.class)
    public ModelAndView customErrorHandler(HttpServletRequest req, CustomException e) throws Exception {
        ErrorInfo errorInfo = new ErrorInfo();
        ModelAndView mav = new ModelAndView();
        errorInfo.setUrl(req.getRequestURL().toString());
        errorInfo.setType(e.getClass().getName());
        errorInfo.setCode(e.getExceptionCode());
        errorInfo.setMessage(e.getExceptionMsg());
        mav.addObject("errorInfo", errorInfo);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(CUSTOM_ERROR_VIEW);
        e.printStackTrace();
        return mav;
    }


    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}
