package com.example.restorans.controller;

import com.example.restorans.model.*;
import com.example.restorans.repository.AlcoholRepository;
import com.example.restorans.repository.DessertRepository;
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
    private final DessertRepository dessertRepository;
    private final AlcoholRepository alcoholRepository;






    //корзина
    @GetMapping("/mylist")
    public String basket(Model model){
        model.addAttribute("order",basketService.findAllBasketList(new Basket()));
        return "basketList";
    }



    //кофе
    @RequestMapping("/mylist/{id}")
    public String AddMyBasketList(@PathVariable(name = "id") Long id) {
        Coffee coffee = coffeeService.getCoffeeById(id);
        Basket basketlist=new Basket(coffee.getId(),coffee.getName(),coffee.getPrice());
        basketService.saveMyorder(basketlist);
        return "redirect:/menu";

    }
    //первые блюда
    @RequestMapping("/mylist/pervieBludo/{id}")
    public String addToBusketFirstBludo(@PathVariable (name = "id") Long id){
        PervieBludo pervieBludo = pervieBludoRepositoty.getReferenceById(id);
        Basket basket = new Basket(pervieBludo.getId(),pervieBludo.getName(),pervieBludo.getPrice());
        basketService.saveMyorder(basket);
        return "redirect:/menu";
    }

    //десерты
    @RequestMapping("/mylist/desert/{id}")
    public String addToBusketDesert(@PathVariable (name = "id") Long id){
        Dessert dessert =  dessertRepository.getReferenceById(id);
        Basket basketDesert = new Basket(dessert.getId(),dessert.getName(),dessert.getPrice());
        basketService.saveMyorder(basketDesert);
        return "redirect:/menu";
    }


    //алкоголь
    @RequestMapping("/mylist/alcohol/{id}")
    public String addBusketAlkohol(@PathVariable (name = "id") Long id){
        Alcohol alcohol = alcoholRepository.getReferenceById(id);
        Basket basketAlkohol = new Basket(alcohol.getId(),alcohol.getName(),alcohol.getPrice());
        basketService.saveMyorder(basketAlkohol);
        return "redirect:/menu";

    }




    //удалить по id   c корзины
    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyListById(@PathVariable (name = "id") Long id){
        basketService.deleteById(id);
        return "redirect:/menu";

    }
}
