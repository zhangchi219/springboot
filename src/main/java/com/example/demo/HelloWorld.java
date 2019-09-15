package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/boot")
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello_world(){
        return "hello";
    }
}
