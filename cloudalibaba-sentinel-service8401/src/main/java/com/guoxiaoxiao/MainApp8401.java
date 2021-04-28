package com.guoxiaoxiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname com.guoxiaoxiao.MainApp8401
 * @Description TODO
 * @Date 2021/4/26 12:00
 * @Created by GUOXIAOXIAO
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {

    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class,args);
    }
}