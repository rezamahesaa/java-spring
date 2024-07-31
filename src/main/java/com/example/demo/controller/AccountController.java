package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.model.Job;
import com.example.demo.model.Placement;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.JobService;
import com.example.demo.service.PlacementService;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private JobService jobService;
    @Autowired
    private PlacementService placementService;
    @Autowired
    private RoleService roleService;

    @GetMapping
    public String index(Model model) {
        List<User> users = userService.get();
        model.addAttribute("users", users);
        return "account/index";
    }

    @GetMapping("register")
    public String register(Model model) {
        List<Job> jobs = jobService.get();
        List<Placement> placements = placementService.get();
        List<Role> roles = roleService.get();
        model.addAttribute("roles", roles);
        model.addAttribute("jobs", jobs);
        model.addAttribute("placements", placements);
        model.addAttribute("employee", new Employee());
        model.addAttribute("user", new User());
        return "account/register";
    }
    
    @PostMapping("save")
    public String save(User user) {
        Role defaultRole = roleService.get(1); // EMPLOYEE ROLE (LOWEST LEVEL)
        employeeService.save(user.getEmployee());      
        user.setRole(defaultRole);  
        return userService.save(user) ? "redirect:/account" : "account/register";
    }
    


    
}
