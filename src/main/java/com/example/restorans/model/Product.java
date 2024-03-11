package com.example.restorans.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "Alcohol_id")
    private Alcohol alcohol;


    @ManyToOne
    @JoinColumn(name = "basket id")
    private Basket basket;


    @ManyToOne
    @JoinColumn(name = "coffee id")
    private Coffee coffee ;
}
