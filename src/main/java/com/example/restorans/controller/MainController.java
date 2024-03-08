package com.example.restorans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }
    @GetMapping("/history")
    public String  histoty (){
        return "history";
    }
}
