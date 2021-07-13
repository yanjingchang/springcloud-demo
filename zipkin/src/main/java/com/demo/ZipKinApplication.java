package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @ClassName: ZipKinApplication
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/13 - 9:59
 * @Vesion: 1.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
