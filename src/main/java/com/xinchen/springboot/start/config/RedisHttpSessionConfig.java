package com.xinchen.springboot.start.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * RedisHttpSessionConfig
 * @author Xin Chen
 * @date 2017/11/29 9:13
 */
@EnableRedisHttpSession
public class RedisHttpSessionConfig {

    @Value("${redis.host}")
    private String hostName;
    @Value("${redis.port}")
    private int port;
    @Value("${redis.database}")
    private int database;

    @Bean
    public JedisConnectionFactory connectionFactory(){
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
        connectionFactory.setHostName(hostName);
        connectionFactory.setPort(port);
        connectionFactory.setDatabase(database);
        return connectionFactory;
    }
}
