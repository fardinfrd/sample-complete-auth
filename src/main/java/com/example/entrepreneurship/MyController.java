package com.example.entrepreneurship;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("hello")
    String getHello() {
        return "hello world";
    }
}
