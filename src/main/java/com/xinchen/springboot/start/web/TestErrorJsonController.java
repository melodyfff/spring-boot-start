package com.xinchen.springboot.start.web;

import com.xinchen.springboot.start.core.constant.ErrorInfoEnum;
import com.xinchen.springboot.start.core.constant.REnum;
import com.xinchen.springboot.start.core.result.GlobalErrorInfoException;
import com.xinchen.springboot.start.core.result.ResultBody;
import com.xinchen.springboot.start.entity.City;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestErrorJsonController {
    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParam(name = "cityName", value = "城市名", required = true, dataType = "String")
    @RequestMapping(value = "/api/city/{cityName}", method= RequestMethod.GET)
    public ResultBody findOneCity(@PathVariable("cityName") String cityName) throws GlobalErrorInfoException {
        // 入参为空
        if (StringUtils.isEmpty(cityName)) {
            throw new GlobalErrorInfoException(ErrorInfoEnum.NOT_FOUND);
        }
        return new ResultBody(new City(1L,2L,"非洲","毛里求斯"));
    }
}
