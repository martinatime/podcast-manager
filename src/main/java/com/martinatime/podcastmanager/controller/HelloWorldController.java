package com.martinatime.podcastmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    @ResponseBody
    public String getHelloWorld() {
        return "{ \"hello\": \"world\" }";
    }
}
