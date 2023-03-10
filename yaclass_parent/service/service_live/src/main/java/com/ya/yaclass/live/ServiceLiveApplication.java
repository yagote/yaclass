package com.ya.yaclass.live;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yagote    create 2023/3/8 21:07
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableConfigurationProperties(com.ya.yaclass.live.config.MTCloudAccountConfig.class)
@EnableFeignClients(basePackages = "com.ya")
@ComponentScan(basePackages = "com.ya")
@MapperScan("com.ya.yaclass.live.mapper")
public class ServiceLiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLiveApplication.class, args);
    }

}
