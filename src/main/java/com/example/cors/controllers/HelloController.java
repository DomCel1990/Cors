package com.example.cors.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:6666"})
public class HelloController {

    @GetMapping
    public String getHello(){
        return "Hello!!";
    }
}
