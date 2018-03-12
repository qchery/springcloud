package com.qchery.springcloud.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.client.RestTemplate;

@RibbonClient("helloClient")
public class HelloClient {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name=" + name, String.class);
    }


}
