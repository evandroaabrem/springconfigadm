package com.example.springconfig.controller;

import com.example.springconfig.config.ConfigServerConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springconfig.service.HelloService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    private final ConfigServerConfig configServerConfig;

    @GetMapping("/hello")
    public String hello() {
       System.out.println(configServerConfig.getNome());
        return helloService.getGreeting();
    }
}
