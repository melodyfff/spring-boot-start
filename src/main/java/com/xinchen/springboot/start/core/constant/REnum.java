package com.xinchen.springboot.start.core.constant;

import com.xinchen.springboot.start.core.result.ErrorInfoInterface;

public enum REnum implements ErrorInfoInterface {

    PARAMS_NO_COMPLETE("000001","params no complete"),
    CITY_EXIT("000002","city exit");

    private String code;

    private String message;

    REnum(String code, String message) {
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
