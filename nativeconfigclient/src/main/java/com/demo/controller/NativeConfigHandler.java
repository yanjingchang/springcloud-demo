package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: NativeConfigHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/8 - 11:23
 * @Vesion: 1.0
 */
@RequestMapping("/native")
@RestController
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return "读取本地配置"+this.port+"-"+this.foo;
    }

}
