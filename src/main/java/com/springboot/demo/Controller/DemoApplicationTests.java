package com.springboot.demo.Controller;

import com.springboot.demo.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoApplicationTests {

    private PostService postService;
    @GetMapping("/")
    public String helloworld() {

        String title = postService.find(1);
        System.out.println(title);
        return "hello,world!";
    }

    @GetMapping("/a")
    public String helloworld1() {
        return "hello,world!";
    }
}

