package com.cjss.demo.controller;

import com.cjss.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/get-data")
    public String index() {
        return "Greetings from Spring Boot!" + helloService.getDetails();
    }

}
