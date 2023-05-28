package cn.itcast.feign.config;

import cn.itcast.feign.fallback.UserClientFallbackFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "cn.itcast.feign.fallback")
@EnableFeignClients(basePackages = "cn.itcast.feign.clients", defaultConfiguration = DefaultFeignConfiguration.class)
public class FeigConfiguration {
}
