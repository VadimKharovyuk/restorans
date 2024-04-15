package com.example.restorans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/history")
    public String histoty() {
        return "history";
    }

    @GetMapping("/paralax")
    public String paralax() {
        return "paralax";
    }
}
