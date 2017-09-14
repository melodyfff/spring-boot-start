package com.xinchen.springboot.start.util;

import org.springframework.stereotype.Service;

@Service
public class AuthErrorProcessor extends CommonErrorBase {

    @Override
    public void check(String msg,String errorKey) throws Exception {
        System.out.println(msg);
        throw new Exception(errorKey);
    }
}
