package com.example.resource_server.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockingController {
    Logger log = LoggerFactory.getLogger(BlockingController.class);

    @GetMapping("/blocking/{sleepInSecond}")
    public String blocking(@PathVariable int sleepInSecond) {
        StringBuffer response = new StringBuffer();

        response.append("Start blocking for ").append(sleepInSecond).append(" seconds ");
        response.append("thread.name: ").append(Thread.currentThread().getName());
        response.append(" started at ").append(System.currentTimeMillis());

        try {
            Thread.sleep(sleepInSecond * 1000);
        } catch (InterruptedException e) {
            log.error("Error occurred while sleeping", e);
        }
        response.append(" ended at ").append(System.currentTimeMillis());
        return response.toString();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}