package com.example.resource_server.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/guest")
    public String guest() {
        return "guest";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
