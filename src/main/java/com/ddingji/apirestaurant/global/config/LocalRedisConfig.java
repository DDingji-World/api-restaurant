package com.ddingji.apirestaurant.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import redis.embedded.RedisServer;

import java.io.IOException;

@Configuration
public class LocalRedisConfig {
    @Value("${spring.data.redis.port}")
    private int redisPort;
    private RedisServer redisServer;

    public void redisServer() {
        try {
            redisServer = new RedisServer(redisPort);
            redisServer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
