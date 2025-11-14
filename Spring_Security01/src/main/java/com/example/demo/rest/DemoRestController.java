package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/welcome")
    public String getWelcome(){
        return "Welcome home guys";
    }

    @GetMapping("/msg")
    public String getGreet(){
        return "Good Morning";
    }

    @GetMapping("/contact")
    public String getContactInfo(){
        return  "Call : +9158639412";
    }
}
