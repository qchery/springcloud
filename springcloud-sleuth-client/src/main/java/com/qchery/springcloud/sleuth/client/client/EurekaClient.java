package com.qchery.springcloud.sleuth.client.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chery
 * @date 2018/3/22 22:43
 */
@FeignClient("eureka-client")
public interface EurekaClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello?name={userName}")
    String sayHello(@RequestParam("userName") String name);

}
