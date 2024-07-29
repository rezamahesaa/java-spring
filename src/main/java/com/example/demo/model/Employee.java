package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tbl_m_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private Integer grossSalary;

    @Column
    private Integer takeHomePay;    

    @OneToOne(mappedBy = "employee")
    // @JsonIgnore
    private List<Deduction> deductions;

    @OneToOne(mappedBy = "employee")
    // @JsonIgnore
    private List<Allowance> allowances;

    @OneToOne(mappedBy = "employee")
    // @JsonIgnore
    private List<User> users;

    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "placement_id", referencedColumnName = "id")
    private Placement placement;

    public Employee(Integer id, Job job, Placement placement, String name, Integer age, String address, String email,
            String phone, Integer grossSalary, Integer takeHomePay) {
        this.id = id;
        this.job = job;
        this.placement = placement;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.grossSalary = grossSalary;
        this.takeHomePay = takeHomePay;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Job getJob() {
        return job;
    }
    public void setJob(Job job) {
        this.job = job;
    }
    public Placement getPlacement() {
        return placement;
    }
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Integer getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(Integer grossSalary) {
        this.grossSalary = grossSalary;
    }
    public Integer getTakeHomePay() {
        return takeHomePay;
    }
    public void setTakeHomePay(Integer takeHomePay) {
        this.takeHomePay = takeHomePay;
    }

    public List<Deduction> getDeductions() {
        return deductions;
    }

    public void setDeductions(List<Deduction> deductions) {
        this.deductions = deductions;
    }
    public List<Allowance> getAllowances() {
        return allowances;
    }

    public void setAllowances(List<Allowance> allowances) {
        this.allowances = allowances;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    
}
