package com.example.restorans.controller;

import com.example.restorans.repository.MenuItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MenuController {
    private final MenuItemRepository menuItemRepository;


    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/menu/coffee")
    public String coffee(Model model){
        model.addAttribute("coffees",menuItemRepository.findAll());
        return "coffee";
    }

    @GetMapping("/menu/alcohol")
    public String alcohol(Model model){
        model.addAttribute("coffees",menuItemRepository.findAll());
        return "alcohol";
    }
}
