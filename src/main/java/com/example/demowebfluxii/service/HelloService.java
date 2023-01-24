package com.example.demowebfluxii.service;

import com.example.demowebfluxii.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@org.springframework.stereotype.Service
public class HelloService {

    @Autowired
    HelloRepository helloRepository;

    public Flux<String> helloMessage(){

        Flux<String> flux = Flux.concat(helloRepository.helloMessage(), helloRepository.helloMessage());
        return flux;
    }
}
