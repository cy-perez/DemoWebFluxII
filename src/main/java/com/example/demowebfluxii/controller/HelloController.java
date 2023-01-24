package com.example.demowebfluxii.controller;

import com.example.demowebfluxii.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public Flux<String> helloMessage(){
        return helloService.helloMessage();
    }
}
