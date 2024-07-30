package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Placement;
import com.example.demo.repository.PlacementRepository;
import com.example.demo.service.PlacementService;



@Service
public class PlacementServiceImpl implements PlacementService{
    @Autowired
    PlacementRepository placementRepository;

    @Override
    public List<Placement> get() {
        return placementRepository.findAll();
    }

    @Override
    public Placement get(Integer id) {
        return placementRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Placement entity) {
        placementRepository.save(entity);
        return placementRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        placementRepository.deleteById(id);
        return placementRepository.findById(id).isEmpty();
    }
    
}
