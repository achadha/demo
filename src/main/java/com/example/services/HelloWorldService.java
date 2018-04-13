package com.example.services;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

/**
 * @author avneetchadha
 */

@Service
public class HelloWorldService {
    public String hello() {
        return "Hello World";
    }
}
