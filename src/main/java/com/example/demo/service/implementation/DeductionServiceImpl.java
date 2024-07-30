package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Deduction;
import com.example.demo.repository.DeductionRepository;
import com.example.demo.service.DeductionService;

@Service
public class DeductionServiceImpl implements DeductionService{
    @Autowired
    DeductionRepository deductionRepository;

    @Override
    public List<Deduction> get() {
        return deductionRepository.findAll();
    }

    @Override
    public Deduction get(Integer id) {
        return deductionRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Deduction entity) {
        deductionRepository.save(entity);
        return deductionRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        deductionRepository.deleteById(id);
        return deductionRepository.findById(id).isEmpty();
    }
    
}
