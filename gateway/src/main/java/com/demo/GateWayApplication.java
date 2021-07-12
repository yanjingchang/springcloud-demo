package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: GageWayApplication
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 17:52
 * @Vesion: 1.0
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class,args);
    }
}
