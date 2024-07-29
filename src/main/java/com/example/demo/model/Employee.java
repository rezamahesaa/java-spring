package com.example.demo.model;

public class Employee {
    private Integer id;
    private Integer jobId;
    private Integer placementId;
    private String name;
    private Integer age;
    private String address;
    private String email;
    private String phone;
    private Integer grossSalary;
    private Integer takeHomePay;

    public Employee(Integer id, Integer jobId, Integer placementId, String name, Integer age, String address, String email,
            String phone, Integer grossSalary, Integer takeHomePay) {
        this.id = id;
        this.jobId = jobId;
        this.placementId = placementId;
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
    public Integer getJobId() {
        return jobId;
    }
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
    public Integer getPlacementId() {
        return placementId;
    }
    public void setPlacementId(Integer placementId) {
        this.placementId = placementId;
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

    
}
