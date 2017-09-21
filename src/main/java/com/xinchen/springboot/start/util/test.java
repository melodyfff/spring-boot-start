package com.xinchen.springboot.start.util;


import java.util.Arrays;
import java.util.List;

public class test {
    private static final List<String> list = Arrays.asList("密码错误","权限不足","error");
    public static void main(String[] args) throws Exception {




        String data = "<data> 权限不足 </data>";

//        if (data==null){
//            throw new Exception("数据为空");
//        }else if(data=="1"){
//            System.out.printf("ok");
//        }else {
//            for (String temp:list){
//                if (data.contains(temp)){
//                    throw new Exception(temp);
//                }
//            }
//        }
        ErrorProcessorUtil.check(data);

    }


}
