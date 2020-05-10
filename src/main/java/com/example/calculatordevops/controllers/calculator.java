package com.example.calculatordevops.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
    @GetMapping("/add")
    public int add(@RequestParam("a") int a,@RequestParam("b") int b){
        return a+b;
    }
}
