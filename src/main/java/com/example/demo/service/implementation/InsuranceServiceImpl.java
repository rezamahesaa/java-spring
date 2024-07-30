package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Insurance;
import com.example.demo.repository.InsuranceRepository;
import com.example.demo.service.InsuranceService;

@Service
public class InsuranceServiceImpl implements InsuranceService{
    @Autowired
    InsuranceRepository insuranceRepository;

    @Override
    public List<Insurance> get() {
        return insuranceRepository.findAll();
    }

    @Override
    public Insurance get(Integer id) {
        return insuranceRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Insurance entity) {
        insuranceRepository.save(entity);
        return insuranceRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        insuranceRepository.deleteById(id);
        return insuranceRepository.findById(id).isEmpty();
    }
    
}
