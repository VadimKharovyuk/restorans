package com.example.restorans.repository;

import com.example.restorans.model.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertRepository  extends JpaRepository<Dessert,Long> {
}
