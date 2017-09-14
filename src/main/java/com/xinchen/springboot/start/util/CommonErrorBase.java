package com.xinchen.springboot.start.util;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CommonErrorBase implements ErrorBase {
    private static final List<String> ERROR_LIST = Arrays.asList("密码错误","权限不足");

    @Override
    public void check(String msg,String errorKey) throws Exception {
        System.out.println(msg);
        throw new Exception(errorKey);
    }
}
