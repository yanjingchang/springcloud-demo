package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: NativeConfigServer
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/8 - 11:14
 * @Vesion: 1.0
 */
@SpringBootApplication
@EnableConfigServer//声明配置中心
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
