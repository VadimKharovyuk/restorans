package com.example.restorans.controller;

import com.example.restorans.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MenuController {
    private final CoffeeRepository coffeeRepository;
    private final AlcoholRepository alcoholRepository;
    private final DessertRepository dessertRepository;
    private final PervieBludoRepositoty pervieBludoRepositoty;
    private final ChildrenEatRepository childrenEatRepository;


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
    @GetMapping("/menu/dessert")
    public String Dessert (Model model){
        model.addAttribute("dessert",dessertRepository.findAll());
        return "dessert";

    }
    @GetMapping("/menu/pervieBludo")
    public String PervieBludo (Model model){
        model.addAttribute("pervieBludo",pervieBludoRepositoty.findAll());
        return "pervieBludo";
    }

    @GetMapping("/menu/childrenEat")
    public String childrenEat(Model model){
        model.addAttribute("childrenEat",childrenEatRepository.findAll());
        return "childrenEat";
    }
}
