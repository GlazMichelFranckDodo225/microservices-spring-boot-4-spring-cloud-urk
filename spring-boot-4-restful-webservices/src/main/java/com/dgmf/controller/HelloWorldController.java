package com.dgmf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
