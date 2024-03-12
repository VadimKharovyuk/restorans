package com.example.restorans.service;

import com.example.restorans.model.Basket;
import com.example.restorans.repository.BasketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BasketService {
    private final BasketRepository basketRepository ;


    public void saveMyorder(Basket basket){
    basketRepository.save(basket);
    }


    public List<Basket> findAllBasketList(Basket basket){
    return basketRepository.findAll();
    }

    public void deleteById(Long id){
        basketRepository.deleteById(id);
    }


}






