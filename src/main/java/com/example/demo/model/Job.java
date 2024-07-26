package com.example.demo.model;

public class Job {
    private int id;
    private String name;
    private int basePay;
    
    public Job(int id, String name, int basePay) {
        this.id = id;
        this.name = name;
        this.basePay = basePay;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBasePay() {
        return basePay;
    }
    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    
}
