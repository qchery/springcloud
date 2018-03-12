package com.qchery.springcloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client")
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello?name={userName}")
    String sayHello(@RequestParam("userName") String name);

}
