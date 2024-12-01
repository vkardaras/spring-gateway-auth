package com.example.resource_server.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class SecureController {
    Logger log = LoggerFactory.getLogger(SecureController.class);

//    @GetMapping("/access_token")
//    public Map<String, String> accessToken(JwtAuthenticationToken jwtToken) {
//        Map<String, Object> tokenAttributes = jwtToken.getTokenAttributes();
//        log.debug("principal class: {}", jwtToken.getPrincipal().getClass());
//
//        var authorities = jwtToken.getAuthorities();
//        log.debug("authorities: {}", authorities);
//        return Map.of(
//                "principal", jwtToken.getName(),
//                "access_token", jwtToken.getToken().getTokenValue(),
//                "authorities", authorities.toString(),
//                "scope",tokenAttributes.containsKey("scope") ? tokenAttributes.get("scope").toString() : ""
//        );
//    }
//
//    @PreAuthorize("hasAuthority('SCOPE_nsa2.user.all') or hasAuthority('SCOPE_nsa2.user.read') or hasAuthority('SCOPE_nsa2.user.write')")
//    @GetMapping("/hello")
//    public Map<String, String> hello(Principal principal, JwtAuthenticationToken jwtToken) {
//        log.info("principal: {}", principal);
//        log.info("name: {}", jwtToken.getName());
//        log.info("principal class: {}", principal.getClass());
//        log.info("jwtToken class: {}", jwtToken.getClass());
//        log.info("authorities: {}", jwtToken.getAuthorities());
//        return Map.of("message", "ResourceServer - Hello, " + principal.getName());
//    }
//
//    @PreAuthorize("hasAuthority('SCOPE_nsa2.admin')")
//    @GetMapping("/admin/hello")
//    public Map<String, String> adminHello(Principal principal) {
//        return Map.of("message", "ResourceServer - Admin Hello, " + principal.getName());
//    }


}