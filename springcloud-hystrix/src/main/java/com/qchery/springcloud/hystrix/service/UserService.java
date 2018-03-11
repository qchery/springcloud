package com.qchery.springcloud.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-javanica#configuration">Hystrix 用法说明</a>
 */
@Service
public class UserService {

    private static Map<String, String> userMap = new HashMap<>();

    static {
        userMap.put("zhangsan", "张三");
        userMap.put("lisi", "李四");
        userMap.put("wangwu", "王五");
    }

    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUserById(String id) {
        String user = userMap.get(id);
        if (user == null) {
            throw new RuntimeException("User Not Exist");
        }
        return user;
    }

    public String defaultUser(String id) {
        return "默认";
    }
}