package com.peter.coin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peter.coin.service.HelloService;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    private HelloService service;

    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>(service.sayHello(), HttpStatus.OK);
    }
}