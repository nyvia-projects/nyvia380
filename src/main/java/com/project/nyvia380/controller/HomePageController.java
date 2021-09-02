package com.project.nyvia380.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomePageController {

    @GetMapping
    public String index() {
        return "Welcome to Nyvia380 Project Page!";
    }

}
