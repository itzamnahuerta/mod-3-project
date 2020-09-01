package com.example.bookstorebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testEndPoint") // don't necessarily need it but it puts testendpoint first before any other /... subgroup get request
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
