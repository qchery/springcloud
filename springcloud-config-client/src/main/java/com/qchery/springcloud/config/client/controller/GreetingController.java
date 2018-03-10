package com.qchery.springcloud.config.client.controller;

import com.qchery.springcloud.config.client.props.GreetingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chery
 * @version 1.0.0
 * @date 2018/3/9
 */
@RefreshScope
@RestController
public class GreetingController {

    @Autowired
    private GreetingProperties greetingProperties;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingProperties.getWelcome() + ", " + name;
    }

}
