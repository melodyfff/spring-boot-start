package com.xinchen.start.web.init;

import com.xinchen.start.web.configuration.StartConfigurationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author xinchen
 * @version 1.0
 * @date 31/05/2019 15:40
 */
@Component
@Slf4j
public class AppRunner implements CommandLineRunner {

    private StartConfigurationProperties properties;

    public AppRunner(StartConfigurationProperties properties) {
        this.properties = properties;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("load [StartConfigurationProperties] : {}",properties);
    }
}
