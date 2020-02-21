package com.pivotal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetingController {

    @Value("${greeting:Hola}")
    private String greeting;

    @Value("${secret:Default}")
    private String secret;


    @GetMapping("/hello")
    public String hello() {
        return String.join(" ", greeting, "World!");
    }

    @GetMapping("/secret")
    public String secret() {
        return String.join(" ", secret, "Value");
    }


}