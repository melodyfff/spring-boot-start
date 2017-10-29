package com.xinchen.springboot.start.web;

import com.xinchen.springboot.start.core.constant.REnum;
import com.xinchen.springboot.start.core.result.GlobalErrorInfoException;
import com.xinchen.springboot.start.core.result.ResultBody;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestErrorJsonController {
    @RequestMapping(value = "/api/city")
    public ResultBody findOneCity(@RequestParam("cityName") String cityName) throws GlobalErrorInfoException {
        // 入参为空
        if (StringUtils.isEmpty(cityName)) {
            throw new GlobalErrorInfoException(REnum.PARAMS_NO_COMPLETE);
        }
        return new ResultBody(new City(1L,2L,"非洲","毛里求斯"));
    }
}
