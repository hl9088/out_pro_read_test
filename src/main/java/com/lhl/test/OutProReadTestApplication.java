package com.lhl.test;

import com.lhl.test.config.TestProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OutProReadTestApplication {

    private static Logger logger = LoggerFactory.getLogger(OutProReadTestApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OutProReadTestApplication.class, args);
        TestProperties testProperties = (TestProperties) applicationContext.getBean("testProperties");
        logger.info("外部配置文件路径{}", testProperties.getPath());
        logger.info("外部配置文件中name={}", testProperties.getName());
        logger.info("外部配置文件中value={}", testProperties.getValue());
    }
}
