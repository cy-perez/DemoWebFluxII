package com.example.demowebfluxii.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Repository
public class HelloRepository {

    public Mono<String> helloMessage(){
        return Mono.just("Hello");
    }
}
