package com.ya.yaclass.live.config;

import com.ya.yaclass.live.mtcloud.MTCloud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author yagote    create 2023/3/8 21:26
 */
@Component
public class MTCloudConfig {

    @Autowired
    private MTCloudAccountConfig mtCloudAccountConfig;

    @Bean
    public MTCloud mtCloudClient(){
        return new MTCloud(mtCloudAccountConfig.getOpenId(), mtCloudAccountConfig.getOpenToken());
    }
}