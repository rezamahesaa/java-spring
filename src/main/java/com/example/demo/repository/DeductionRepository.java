package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Deduction;

public interface DeductionRepository extends JpaRepository<Deduction, Integer>{
    
}
