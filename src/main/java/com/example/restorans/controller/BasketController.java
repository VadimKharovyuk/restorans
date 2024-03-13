package com.example.restorans.controller;

import com.example.restorans.model.Basket;
import com.example.restorans.model.Coffee;
import com.example.restorans.model.PervieBludo;
import com.example.restorans.repository.PervieBludoRepositoty;
import com.example.restorans.service.BasketService;
import com.example.restorans.service.CoffeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class BasketController {
    private final BasketService basketService;
    private final CoffeeService coffeeService;
    private final PervieBludoRepositoty pervieBludoRepositoty;



    @GetMapping("/mylist")
    public String basket(Model model){
        model.addAttribute("order",basketService.findAllBasketList(new Basket()));
        return "basketList";
    }



    @RequestMapping("/mylist/{id}")
    public String getMybasketList(@PathVariable(name = "id") Long id) {
        Coffee coffee = coffeeService.getCoffeeById(id);
        Basket basketlist=new Basket(coffee.getId(),coffee.getName(),coffee.getPrice());
        basketService.saveMyorder(basketlist);
        return "redirect:/menu";

    }
    @RequestMapping("/mylist/pervieBludo/{id}")
    public String addToBusketFirstBludo(@PathVariable (name = "id") Long id){
        PervieBludo pervieBludo = pervieBludoRepositoty.getReferenceById(id);
        Basket basket = new Basket(pervieBludo.getId(),pervieBludo.getName(),pervieBludo.getPrice());
        basketService.saveMyorder(basket);
        return "redirect:/menu";
    }


    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyListById(@PathVariable (name = "id") Long id){
        basketService.deleteById(id);
        return "redirect:/menu";

    }
}
