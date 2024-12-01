package com.example.resource_server.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    Map<String, String> hello(@AuthenticationPrincipal Jwt jwt) {
        return Map.of("message", "Hello " + jwt.getSubject());
    }

    @PreAuthorize("hasAuthority('SCOPE_user.read')")
    @GetMapping("/read")
    Map<String, String> read(@AuthenticationPrincipal Jwt jwt) {
        return Map.of("scoped", "Hello " + jwt.getSubject());
    }
}
