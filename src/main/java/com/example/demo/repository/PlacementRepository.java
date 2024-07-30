package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Integer>{
    
}
