package com.example.bookstorebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secondEndPoint")
public class SecondTestController {
    @GetMapping
    public String secondendpoint() {
        return "I'm second enpoint, who you?";
    }
}
