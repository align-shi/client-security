package com.xiaoshi.baseconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaoshi
 */
@SpringBootApplication(scanBasePackages = "com.xiaoshi")
public class BaseConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseConfigApplication.class, args);
    }
/*
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BaseConfigApplication.class);
    }*/
}
