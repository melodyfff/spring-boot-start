package com.xinchen.springboot.start.core.result;

import com.xinchen.springboot.start.core.constant.ErrorInfoEnum;
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
        this.code = ErrorInfoEnum.SUCCESS.getCode();
        this.message = ErrorInfoEnum.SUCCESS.getMessage();
        this.result = result;
    }

}
