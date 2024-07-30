package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Allowance;
import com.example.demo.repository.AllowanceRepository;
import com.example.demo.service.AllowanceService;

@Service
public class AllowanceServiceImpl implements AllowanceService{
    @Autowired
    AllowanceRepository allowanceRepository;

    @Override
    public List<Allowance> get() {
        return allowanceRepository.findAll();
    }

    @Override
    public Allowance get(Integer id) {
        return allowanceRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Allowance entity) {
        allowanceRepository.save(entity);
        return allowanceRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        allowanceRepository.deleteById(id);
        return allowanceRepository.findById(id).isEmpty();
    }
    
}
