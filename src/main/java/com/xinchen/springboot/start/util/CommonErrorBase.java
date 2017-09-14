package com.xinchen.springboot.start.util;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CommonErrorBase implements ErrorBase {
    @Override
    public void check(String msg,String errorKey) throws Exception {
        System.out.println(msg);
        throw new Exception(errorKey);
    }
}
