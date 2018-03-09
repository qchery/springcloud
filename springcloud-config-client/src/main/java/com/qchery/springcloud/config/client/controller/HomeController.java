package com.qchery.springcloud.config.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chery
 * @version 1.0.0
 * @date 2018/3/9
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

}
