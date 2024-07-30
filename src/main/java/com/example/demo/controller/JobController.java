package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Job;
import com.example.demo.service.JobService;





@Controller
@RequestMapping("job") //url awal;
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping //nambah direktori lg misalkan disini dikasi index jdnya localhost:8080/job/index
    public String index(Model model) {
        List<Job> jobs = jobService.get();
        model.addAttribute("jobs", jobs);
        return "job/index"; //direktori file html, yaitu di resources template
    }
    
    @GetMapping("form")
    public String form(Model model) {
        model.addAttribute("job", new Job());
        return "job/form";
    }

    @PostMapping("save")
    public String save(Job job) {       
        return jobService.save(job) ? "redirect:/job" : "job/form";
    }

    @GetMapping("edit")
    public String edit(Model model, @RequestParam Integer inputId) {
        Job job = jobService.get(inputId);
        model.addAttribute("job", job);
        return "job/edit";
    }

    @GetMapping("delete")
    public String delete(@RequestParam Integer inputId) {
        return jobService.delete(inputId) ? "redirect:/job" : "redirect:/job";
    }
    
    
    
    
}
