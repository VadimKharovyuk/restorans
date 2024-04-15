package com.example.restorans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DezainController {
    @GetMapping("/dezain")
    public String dezzin() {
        return "dezain";
    }
}
