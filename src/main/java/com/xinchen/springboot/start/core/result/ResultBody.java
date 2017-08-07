package com.xinchen.springboot.start.core.result;

import lombok.Data;

/**
 * 返回实体
 */
@Data
public class ResultBody {
    //响应代码
    private String code;

    //响应消息
    private  String message;

    //响应结果
    private Object result;

    public ResultBody(ErrorInfoInterface errorInfo) {
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
    }

    public ResultBody(Object result) {
        this.code = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.message = GlobalErrorInfoEnum.SUCCESS.getMessage();
        this.result = result;
    }

}
