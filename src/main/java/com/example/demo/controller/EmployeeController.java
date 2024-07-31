package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.model.Job;
import com.example.demo.model.Placement;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.JobService;
import com.example.demo.service.PlacementService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private JobService jobService;
    @Autowired
    private PlacementService placementService;

    @GetMapping
    public String index(Model model) {
        List<Employee> employees = employeeService.get();
        model.addAttribute("employees", employees);
        return "employee/index";
    }

    @GetMapping("form")
    public String form(Model model) {
        List<Job> jobs = jobService.get();
        List<Placement> placements = placementService.get();
        model.addAttribute("jobs", jobs);
        model.addAttribute("placements", placements);
        model.addAttribute("employee", new Employee());
        return "employee/form";
    }

    @PostMapping("save")
    public String save(Employee employee) {   
        return employeeService.save(employee) ? "redirect:/employee" : "employee/form";
    }
    
    @GetMapping("edit")
    public String edit(Model model, @RequestParam Integer inputId) {
        List<Job> jobs = jobService.get();
        List<Placement> placements = placementService.get();
        model.addAttribute("jobs", jobs);
        model.addAttribute("placements", placements);
        Employee employee = employeeService.get(inputId);
        model.addAttribute("employee", employee);
        return "employee/edit";
    }
    
    @GetMapping("delete")
    public String delete(@RequestParam Integer inputId) {
        return employeeService.delete(inputId) ? "redirect:/employee" : "redirect:/employee";
    }
    
}
