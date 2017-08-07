package com.xinchen.springboot.start.web;

import com.xinchen.springboot.start.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Action;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String main(HttpServletRequest request){
        request.getSession().setAttribute("token","123");
        return testService.say();
    }
}
