package com.xinchen.start.web;

import com.xinchen.start.web.configuration.StartConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 *
 */
@SpringBootApplication(scanBasePackages = "com.xinchen.start")
@EntityScan("com.xinchen.start.common.entity")
@EnableConfigurationProperties(StartConfigurationProperties.class)
public class ContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContextApplication.class, args);
        System.out.println();
    }

}
