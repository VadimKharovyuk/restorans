package com.example.restorans.repository;

import com.example.restorans.model.ChildrenEat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenEatRepository extends JpaRepository<ChildrenEat,Long> {
}
