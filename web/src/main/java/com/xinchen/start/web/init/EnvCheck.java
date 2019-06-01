package com.xinchen.start.web.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.web.context.support.StandardServletEnvironment;

/**
 *
 * 检查当前加载了哪些PropertySource
 *
 * @author xinchen
 * @version 1.0
 * @date 31/05/2019 11:32
 */
@Configuration
@Slf4j
public class EnvCheck implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        final MutablePropertySources propertySources = ((StandardServletEnvironment) environment).getPropertySources();
        log.info("loaded PropertySources : {}",propertySources.toString());
    }
}
