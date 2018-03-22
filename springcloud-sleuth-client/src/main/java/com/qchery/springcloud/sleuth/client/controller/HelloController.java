package com.qchery.springcloud.sleuth.client.controller;

import com.qchery.springcloud.sleuth.client.client.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chery
 * @date 2018/3/22 22:39
 */
@RestController
public class HelloController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("sayHello")
    public String sayHello(@RequestParam String name) {
        return eurekaClient.sayHello(name);
    }

}
