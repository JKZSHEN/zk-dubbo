package com.jk;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author zhangZaiShen
 * @Description //TODO $
 * @Date $ $
 **/

@SpringBootApplication
@EnableDubbo
public class ZkDubboWebApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ZkDubboWebApiApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ZkDubboWebApiApplication.class);
    }
}
