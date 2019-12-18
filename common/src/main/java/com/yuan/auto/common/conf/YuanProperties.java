package com.yuan.auto.common.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix="yuan")
public class YuanProperties {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
