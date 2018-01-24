package com.xinchen.springboot.start.core.util;

import org.springframework.stereotype.Service;

@Service
public class CommonErrorBase implements ErrorBase {
    @Override
    public void check(String msg,String errorKey) throws Exception {
        System.out.println(msg);
        throw new Exception(errorKey);
    }
}