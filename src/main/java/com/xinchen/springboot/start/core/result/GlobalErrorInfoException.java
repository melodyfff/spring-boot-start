package com.xinchen.springboot.start.core.result;


/**
 * 统一错误码异常
 */
public class GlobalErrorInfoException extends Exception{
    private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException (ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * get errorInfo
     *
     * @return errorInfo
     */
    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    /**
     * set errorInfo
     *
     * @param errorInfo errorInfo
     */
    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
