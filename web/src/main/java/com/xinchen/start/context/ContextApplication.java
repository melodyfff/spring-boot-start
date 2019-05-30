package com.xinchen.start.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 */
@SpringBootApplication(scanBasePackages = "com.xinchen.start")
@EntityScan("com.xinchen.start.common.entity")
public class ContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContextApplication.class, args);
    }

}
