package com.qchery.springcloud.stream;

import com.qchery.springcloud.stream.service.MQService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author Chery
 * @date 2018/3/20 21:07
 */
@EnableBinding(MQService.class)
@SpringBootApplication
public class StreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class, args);
    }

    @StreamListener(MQService.INPUT)
    public void processMsg(String msg) {
        System.out.println(msg);
    }
}
