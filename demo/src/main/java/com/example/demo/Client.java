package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("say-hello")
public interface Client {
    @RequestMapping(value = "/")
    String home();
}
