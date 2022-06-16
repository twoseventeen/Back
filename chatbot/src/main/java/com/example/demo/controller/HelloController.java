package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api")
    public String test() {
        return "aws 개 개애애애애애애애ㅐ애애애애애ㅐ애애 싫다 ";
    }
}
