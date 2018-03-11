package com.qchery.springcloud.hystrix.controller;

import com.qchery.springcloud.hystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserById")
    public String getUserById(@RequestParam String id) {
        return userService.getUserById(id);
    }

}
