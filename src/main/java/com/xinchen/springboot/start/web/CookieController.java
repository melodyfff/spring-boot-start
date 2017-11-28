package com.xinchen.springboot.start.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author Xin Chen (xinchenmelody@gmail.com)
 * @Date: Created In 2017/11/29 0:24
 */
@Controller
public class CookieController {

    //localhost:8080/test/cookie?browser=chrome
    @RequestMapping("/test/cookie")
    @ResponseBody
    public String cookie(@RequestParam("browser") String brower, HttpServletRequest request,
                         HttpSession session) {

        StringBuilder sb = new StringBuilder("Cookie INFO: \n");

        Object sessionBrowser = session.getAttribute("browser");
        if (sessionBrowser == null){
            System.out.println("No Session,init browser=" + brower);
            session.setAttribute("browser",brower);
        } else {
            System.out.println("Session Exits,browser=" + sessionBrowser.toString());
        }

        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0){
            for (Cookie cookie: cookies) {
                sb.append(cookie.getName() + ":" + cookie.getValue() + "\n");
                System.out.println(cookie.getName() + ":" + cookie.getValue());
            }
        }
        return sb.toString();
    }
}
