package com.example.services;

import org.springframework.stereotype.Service;

/**
 * @author avneetchadha
 */

@Service
public class HelloWorldService {
    public String hello() {
        return "Hello World";
    }
}
