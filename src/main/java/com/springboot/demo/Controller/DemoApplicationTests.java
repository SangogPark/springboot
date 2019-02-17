package com.springboot.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationTests {

    @GetMapping("/")
    public String helloworld() {
        return "hello,world!";
    }
}

