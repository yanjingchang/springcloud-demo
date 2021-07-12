package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/10 - 10:01
 * @Vesion: 1.0
 */
@RequestMapping("/config")
@RestController
@RefreshScope
public class HelloHandler {
    @Value("${server.port}")
    private int port;

    @RequestMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }
}
