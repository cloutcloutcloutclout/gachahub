package com.example.gachahub.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/skep")
    public String home(){
        return "home";
    }
}
