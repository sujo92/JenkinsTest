package com.suziesta.springbootawsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/docker")
public class SpringBootAwsController {

    @GetMapping
    public String home(){
        return "Welcome to AWS First Deployment";
    }
}
