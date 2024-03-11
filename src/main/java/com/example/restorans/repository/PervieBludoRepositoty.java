package com.example.restorans.repository;

import com.example.restorans.model.PervieBludo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PervieBludoRepositoty  extends JpaRepository<PervieBludo,Long> {
}
