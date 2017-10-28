package com.xinchen.springboot.start.web;

import com.xinchen.springboot.start.core.result.GlobalErrorInfoException;
import com.xinchen.springboot.start.service.TestService;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private CacheManager cacheManager;

    @RequestMapping("/")
    public String main(HttpServletRequest request) throws GlobalErrorInfoException {
        String sessionId = request.getSession().getId();
        Element temp = cacheManager.getCache("sessionCache").get(sessionId);
        if (null==temp) {
            cacheManager.getCache("sessionCache").put(new Element(sessionId, "123"));
            request.getSession().setAttribute("token", sessionId);
        }
        return testService.say();
    }

    @RequestMapping("/clear")
    public String clear(HttpServletRequest request) {
        String token = (String) request.getSession().getAttribute("token");
        boolean remove = cacheManager.getCache("sessionCache").remove(token);
        request.getSession().removeAttribute("token");
        return token + "is removing   flag=" + remove;
    }
}
