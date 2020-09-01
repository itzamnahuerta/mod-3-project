package com.example.bookstorebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testEndPoint")
public class TestController {
    @GetMapping
    public String endpoint(){
        return "Testing Endpoint";
    }

    // make an endpoint /testEndPoint/name
    // which will return my name
    @GetMapping("/name")
    public String name() {
        return "Itzamna";
    }
}
