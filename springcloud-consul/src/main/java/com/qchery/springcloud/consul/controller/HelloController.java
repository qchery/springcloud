package com.qchery.springcloud.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chery
 * @date 2018/3/30 22:09
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello , " + name;
    }

}
