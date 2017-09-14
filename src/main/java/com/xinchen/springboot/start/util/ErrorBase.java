package com.xinchen.springboot.start.util;

public interface ErrorBase {
    void check(String msg, String errorKey) throws Exception;
}
