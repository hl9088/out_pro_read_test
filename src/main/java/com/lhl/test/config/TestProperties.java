package com.lhl.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by lihongli on 2019/3/5
 */
@Configuration
@PropertySource(value = {"classpath:test.properties", "file:${spring.profiles.path}/test.properties"}, ignoreResourceNotFound = true, encoding = "utf-8")
public class TestProperties {

    @Value("${spring.profiles.path}")
    private String path;

    /**
     * 获取值乱码的解决方案 PropertySource增加encoding属性配置
     */
    @Value("${test.name}")
    private String name;

    @Value("${test.value}")
    private String value;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
