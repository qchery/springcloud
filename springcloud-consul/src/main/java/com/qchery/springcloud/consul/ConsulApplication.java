package com.qchery.springcloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Chery
 * @date 2018/3/30 22:08
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
    }

}

