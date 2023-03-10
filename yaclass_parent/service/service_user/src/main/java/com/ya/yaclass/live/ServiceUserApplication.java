package com.ya.yaclass.live;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yagote    create 2023/3/7 18:13
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ya.yaclass.live.mapper")
@ComponentScan(basePackages = "com.ya")
public class ServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }

}
