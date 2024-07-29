package com.example.demo.model;

public class Job {
    private Integer id;
    private String name;
    private Integer basePay;
    
    public Job(Integer id, String name, Integer basePay) {
        this.id = id;
        this.name = name;
        this.basePay = basePay;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getBasePay() {
        return basePay;
    }
    public void setBasePay(Integer basePay) {
        this.basePay = basePay;
    }

    
}
