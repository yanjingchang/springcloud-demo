package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: com.demo.RegsitryCenterApplication
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 12:43
 * @Vesion: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class RegsitryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegsitryCenterApplication.class,args);
    }
}
