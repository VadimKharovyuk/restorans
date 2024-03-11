package com.example.restorans.controller;

import com.example.restorans.repository.AlcoholRepository;
import com.example.restorans.repository.CoffeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MenuController {
    private final CoffeeRepository coffeeRepository;
    private final AlcoholRepository alcoholRepository;


    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/menu/coffee")
    public String coffee(Model model){
        model.addAttribute("coffees", coffeeRepository.findAll());
        return "coffee";
    }

    @GetMapping("/menu/alcohol")
    public String alcohol(Model model){
        model.addAttribute("coffees", alcoholRepository.findAll());
        return "alcohol";
    }
}
