package com.xinchen.springboot.start.core.constant;

import com.xinchen.springboot.start.core.result.ErrorInfoInterface;

/**
 * 应用系统级别的错误码
 */
public enum ErrorInfoEnum implements ErrorInfoInterface {
    SUCCESS("0", "success"),
    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    ErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
