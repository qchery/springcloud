package com.qchery.springcloud.sleuth.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

/**
 * @author Chery
 * @date 2018/3/22 22:34
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SleuthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthClientApplication.class, args);
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

}
