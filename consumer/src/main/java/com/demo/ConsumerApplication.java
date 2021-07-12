package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConsumerApplication
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 16:00
 * @Vesion: 1.0
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
    //consumer调用服务的实现需要结合RestTemplate完成
    //即在服务消费者consumer中通过RestTemplate来调用服务提供者provider的相关接口
    //创建RestTemplate实例并通过@Bean注解到IOC容器中
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
