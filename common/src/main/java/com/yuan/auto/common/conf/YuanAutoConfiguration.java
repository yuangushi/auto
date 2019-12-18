package com.yuan.auto.common.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({YuanProperties.class})
public class YuanAutoConfiguration {

    private String name;
    public YuanAutoConfiguration(YuanProperties properties){
        this.name=properties.getName();

    }
}
