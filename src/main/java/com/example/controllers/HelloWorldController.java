package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.services.HelloWorldService;

/**
 * @author avneetchadha
 */

@Controller
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping("/hello")
    public String helloEndpoint() {
        return helloWorldService.hello();
    }
}
