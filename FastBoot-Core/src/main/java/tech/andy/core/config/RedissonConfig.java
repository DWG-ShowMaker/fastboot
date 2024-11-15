package tech.andy.core.config;

import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Redisson 配置类
 */
@Configuration
public class RedissonConfig {

    @Value("${fastboot.redis.host}")
    private String redisHost;

    @Value("${fastboot.redis.port}")
    private int redisPort;

    /**
     * 配置 RedissonClient
     * @return RedissonClient
     */
    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://" + redisHost + ":" + redisPort);
        return org.redisson.Redisson.create(config);
    }
}

