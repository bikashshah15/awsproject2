package com.awsproject2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
    @GetMapping("/message")
    public String newMessage(Model model){
        return "message";
    }
}
