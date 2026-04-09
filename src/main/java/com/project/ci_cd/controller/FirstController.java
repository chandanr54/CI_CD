package com.project.ci_cd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class FirstController {

    @GetMapping
    public String first() {
        return "Hello Form CI/CD pipe line  ..";
    }
}
