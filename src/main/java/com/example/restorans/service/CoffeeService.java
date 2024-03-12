package com.example.restorans.service;

import com.example.restorans.model.Coffee;
import com.example.restorans.repository.CoffeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CoffeeService {
    private final CoffeeRepository coffeeRepository ;

    public void save(Coffee coffee){
        coffeeRepository.save(coffee);

    }

    public List<Coffee> findAll(Coffee coffee){
        return coffeeRepository.findAll();
    }
    public Coffee getCoffeeById( Long id){
        return coffeeRepository.findById(id).get();
    }
    public void deleteById(Long id){
        coffeeRepository.deleteById(id);
    }



}



