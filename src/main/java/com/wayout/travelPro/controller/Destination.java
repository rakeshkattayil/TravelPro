package com.wayout.travelPro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destination")
public class Destination {
    @GetMapping("/greeting")
    public String greeting() {
        return "Welcome to TravelPro!!!!";
    }
}
