package com.example.doument_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Document Service!";
    }
}
