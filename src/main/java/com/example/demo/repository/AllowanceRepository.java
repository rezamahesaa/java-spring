package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Allowance;

public interface AllowanceRepository extends JpaRepository<Allowance, Integer>{
    
}
