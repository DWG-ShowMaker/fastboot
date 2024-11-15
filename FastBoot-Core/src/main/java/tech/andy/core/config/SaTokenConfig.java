package tech.andy.core.config;

import cn.dev33.satoken.SaManager;
import cn.dev33.satoken.stp.StpInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Sa-Token 配置类
 */
@Configuration
public class SaTokenConfig {

    /**
     * 注入StpInterface，用于自定义权限验证接口
     * @return StpInterface
     */
    @Bean
    public StpInterface stpInterface() {
        return SaManager.getStpInterface();
    }
}

