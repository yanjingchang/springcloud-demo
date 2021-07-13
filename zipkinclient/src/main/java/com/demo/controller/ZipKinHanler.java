package com.demo.controller;

/**
 * @ClassName: ZipKinHanler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/13 - 10:09
 * @Vesion: 1.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/zipkin")
@RestController
public class ZipKinHanler {

    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index(){
        return "当前端口：" + port;
    }
}
