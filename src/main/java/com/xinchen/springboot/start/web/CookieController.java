package com.xinchen.springboot.start.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @date: Created In 2017/11/29 0:24
 */
@Controller
public class CookieController {

    //localhost:8080/test/cookie?browser=chrome
    @RequestMapping("/test/cookie")
    @ResponseBody
    public Object cookie(@RequestParam("browser") String brower, HttpServletRequest request,
                         HttpSession session) {

        Map<String , String> map= new HashMap<>(16);


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
                map.put(cookie.getName(), cookie.getValue());
                System.out.println(cookie.getName() + ":" + cookie.getValue());
            }
        }
        return JSON.toJSON(map);
    }
}
