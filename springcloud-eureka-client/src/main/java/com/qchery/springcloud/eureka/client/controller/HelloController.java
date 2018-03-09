package com.qchery.springcloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Controller
 *
 * @author Chery
 * @version 1.0.0
 * @date 2018/3/8
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello, " + name + ", port : " + port;
    }

}
