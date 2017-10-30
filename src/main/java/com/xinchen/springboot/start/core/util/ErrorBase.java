package com.xinchen.springboot.start.core.util;

public interface ErrorBase {
    void check(String msg, String errorKey) throws Exception;
}
