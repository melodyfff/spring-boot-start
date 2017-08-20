package com.xinchen.springboot.start.domain;

import com.xinchen.springboot.start.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TestDao implements TestService{
    @Value("${com.xinchen.name}")
    private String name;

    @Override

    public String say() {
        return "hello world!!!!"+name;
    }
}
