package com.xinchen.springboot.start.core.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
@Component

public class ErrorProcessorUtil {
    //private static final List<String> ERROR_LIST = Arrays.asList("密码错误","权限不足");
    private static final Map<String,Class<? extends ErrorBase>> map=new HashMap<>();
    @Autowired(required = true)
//    private List<? extends ErrorBase> errorBases = new ArrayList<>();
    private Map<String,? extends ErrorBase> errorBases = new HashMap<>();

    static {
        map.put("密码错误",PwdErrrorProcessor.class);
        map.put("权限不足",AuthErrorProcessor.class);
        map.put("error1",CommonErrorBase.class);
        map.put("error2",CommonErrorBase.class);
    }

    public static void check(String msg) throws Exception {


        Set<Map.Entry<String, Class<? extends ErrorBase>>> entries = map.entrySet();
        for (final Map.Entry<String, Class<? extends ErrorBase>> entry:entries){
            if (msg.contains(entry.getKey())){
                Class<? extends ErrorBase> value = entry.getValue();
                ErrorBase errorBase = value.newInstance();
                errorBase.check(msg,entry.getKey());
            }
        }
    }

}
