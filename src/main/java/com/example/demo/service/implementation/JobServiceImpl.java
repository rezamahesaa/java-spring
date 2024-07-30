package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Job;
import com.example.demo.repository.JobRepository;
import com.example.demo.service.JobService;

@Service
public class JobServiceImpl implements JobService{
    @Autowired
    private JobRepository jobRepository;

    // public JobServiceImpl(JobRepository jobRepository){
    //     this.jobRepository = jobRepository;
    // }

    @Override
    public List<Job> get() {
        return jobRepository.findAll();
    }

    @Override
    public Job get(Integer id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Job entity) {
        jobRepository.save(entity);
        return jobRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        jobRepository.deleteById(id);
        return jobRepository.findById(id).isEmpty();
    }
    
}
