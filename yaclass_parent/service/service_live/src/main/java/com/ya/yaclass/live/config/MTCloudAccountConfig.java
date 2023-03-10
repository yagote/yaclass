package com.ya.yaclass.live.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yagote    create 2023/3/8 21:25
 */
@Data
@Component
@ConfigurationProperties(prefix = "mtcloud")
public class MTCloudAccountConfig {

    private String openId;
    private String openToken;

}
