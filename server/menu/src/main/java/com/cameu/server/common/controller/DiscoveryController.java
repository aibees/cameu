package com.cameu.server.common.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/actuator")
@AllArgsConstructor
public class DiscoveryController {

    private final RestTemplate restTemplate;

    @GetMapping("/info")
    String discoveryClient() {
        String answer = restTemplate.getForObject(
                "http://eurekaClient_menu/eureka/client",
                String.class
        );
        return answer;
    }
}
