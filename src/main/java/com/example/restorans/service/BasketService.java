package com.example.restorans.service;

import com.example.restorans.model.Basket;
import com.example.restorans.repository.BasketRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
@Setter
@Getter
public class BasketService {
    private final BasketRepository basketRepository;


    public void saveMyorder(Basket basket) {
        basketRepository.save(basket);
    }


    public List<Basket> findAllBasketList(Basket basket) {
        return basketRepository.findAll();
    }

    public void deleteById(Long id) {
        basketRepository.deleteById(id);
    }


    private List<Basket> orders;

    // Другие поля и методы корзины

    public BigDecimal calculateTotalOrderCost() {
        BigDecimal totalCost = BigDecimal.ZERO; // Начальное значение общей стоимости

        // Проходимся по всем заказам в корзине и добавляем их стоимость к общей стоимости
        for (Basket order : basketRepository.findAll()) {
            totalCost = totalCost.add(order.getPrice());
        }

        return totalCost;
    }


}






