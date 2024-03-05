package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @RequestMapping("")
    String home() {
        return "Hello  World! , 2023309020  黄欣萍";
    }
}





