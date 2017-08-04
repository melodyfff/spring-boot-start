package com.xinchen.springboot.start.domain;

import com.xinchen.springboot.start.service.TestService;
import org.springframework.stereotype.Service;


@Service
public class TestDao implements TestService{
    @Override
    public String say() {
        return "hello world!!!!";
    }
}
