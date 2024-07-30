package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Travel;
import com.example.demo.repository.TravelRepository;
import com.example.demo.service.TravelService;

@Service
public class TravelServiceImpl implements TravelService{
    @Autowired
    TravelRepository travelRepository;

    @Override
    public List<Travel> get() {
        return travelRepository.findAll();
    }

    @Override
    public Travel get(Integer id) {
        return travelRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Travel entity) {
        travelRepository.save(entity);
        return travelRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        travelRepository.deleteById(id);
        return travelRepository.findById(id).isEmpty();
    }
    
}
