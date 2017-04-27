package org.sun.exception;

/**
 * Created by Mr.sun on 2017/3/23.
 */
public class CustomException extends Exception {

    private int exceptionCode;
    private String exceptionMsg;

    public CustomException(int exceptionCode, String exceptionMsg) {
        this.exceptionCode = exceptionCode;
        this.exceptionMsg =exceptionMsg;
    }

    public int getExceptionCode() {
        return exceptionCode;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}
