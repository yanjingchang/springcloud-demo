package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: FeignAppliation
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/8 - 10:03
 * @Vesion: 1.0
 */
@SpringBootApplication
@EnableFeignClients//声明启动Feign
public class FeignAppliation {
    public static void main(String[] args) {
        SpringApplication.run(FeignAppliation.class,args);
    }
}
