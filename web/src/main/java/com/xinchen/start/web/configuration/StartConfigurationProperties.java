package com.xinchen.start.web.configuration;

import com.xinchen.start.web.configuration.model.HostProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

/**
 * 自定义配置
 *
 * @author xinchen
 * @version 1.0
 * @date 31/05/2019 14:04
 */
@ConfigurationProperties("start")
public class StartConfigurationProperties implements Serializable {
    public static final String PREFIX = "start";


    @NestedConfigurationProperty
    private HostProperties host = new HostProperties();


    public HostProperties getHost() {
        return host;
    }

    public void setHost(HostProperties host) {
        this.host = host;
    }
}
