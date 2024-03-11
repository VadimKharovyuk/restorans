package com.example.restorans.repository;

import com.example.restorans.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<Product,Long> {
}
