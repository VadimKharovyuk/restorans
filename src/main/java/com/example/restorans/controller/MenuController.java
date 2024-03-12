package com.example.restorans.controller;

import com.example.restorans.model.Basket;
import com.example.restorans.model.Coffee;
import com.example.restorans.repository.*;
import com.example.restorans.service.BasketService;
import com.example.restorans.service.CoffeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class MenuController {
    private final CoffeeService coffeeService ;
    private final AlcoholRepository alcoholRepository;
    private final DessertRepository dessertRepository;
    private final PervieBludoRepositoty pervieBludoRepositoty;
    private final ChildrenEatRepository childrenEatRepository;
    private final BasketService basketService ;



    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/menu/coffee")
    public String coffee(Model model){
        model.addAttribute("coffees", coffeeService.findAll(new Coffee()));
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

    @GetMapping("/mylist")
    public String basket(Model model){
        model.addAttribute("order",basketService.findAllBasketList(new Basket()));
        return "basketList";
    }



    @RequestMapping("/mylist/{id}")
    public String getMybasketList(@PathVariable (name = "id") Long id) {
         Coffee coffee = coffeeService.getCoffeeById(id);
         Basket basketlist=new Basket(coffee.getId(),coffee.getName(),coffee.getPrice());
         basketService.saveMyorder(basketlist);
        return "basketList";

    }

  @RequestMapping("/deleteMyList/{id}")
    public String deleteMyListById(@PathVariable (name = "id") Long id){
      basketService.deleteById(id);
        return "coffee";

    }


}
