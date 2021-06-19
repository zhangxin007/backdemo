package com.example.backdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @RequestMapping("/test/hellow")
    public String test(){
        return "hello worf";
    }
}
