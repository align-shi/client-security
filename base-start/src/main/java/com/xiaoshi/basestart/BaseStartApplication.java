package com.xiaoshi.basestart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaoshi
 */
@SpringBootApplication
public class BaseStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseStartApplication.class, args);
    }

    /**
     * 使用外部容器启动 需要重写此方法
     * @param builder
     * @return
     */
   /* @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(BaseStartApplication.class);
    }*/
}
