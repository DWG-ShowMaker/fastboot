package tech.andy.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tech.andy.core.config.MybatisPlusConfig;
import tech.andy.core.config.RedissonConfig;
import tech.andy.core.config.SaTokenConfig;

/**
 * 快速启动器配置类
 */
@Configuration
@Import({MybatisPlusConfig.class, RedissonConfig.class, SaTokenConfig.class})
public class QuickAutoConfiguration {
    /**
     * 配置 MybatisPlus
     *
     * @return MybatisPlusConfig
     */
    @Bean
    public MybatisPlusConfig mybatisPlusConfig() {
        return new MybatisPlusConfig();
    }

    /**
     * 配置 Redisson
     *
     * @return RedissonConfig
     */
    @Bean
    public RedissonConfig redissonConfig() {
        return new RedissonConfig();
    }

    /**
     * 配置 SaToken
     *
     * @return SaTokenConfig
     */
    @Bean
    public SaTokenConfig saTokenConfig() {
        return new SaTokenConfig();
    }
}
