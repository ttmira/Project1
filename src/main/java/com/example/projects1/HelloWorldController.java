package com.example.projects1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello World from Tamara IT2-2215";
    }
}
