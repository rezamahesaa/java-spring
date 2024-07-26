package com.example.demo.model;

public class Deduction {
    private int id;
    private int employeeId;
    private int tax;
    private int otherDeduction;
    private int totalDeduction;
    
    public Deduction(int id, int employeeId, int tax, int otherDeduction, int totalDeduction) {
        this.id = id;
        this.employeeId = employeeId;
        this.tax = tax;
        this.otherDeduction = otherDeduction;
        this.totalDeduction = totalDeduction;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getTax() {
        return tax;
    }
    public void setTax(int tax) {
        this.tax = tax;
    }
    public int getOtherDeduction() {
        return otherDeduction;
    }
    public void setOtherDeduction(int otherDeduction) {
        this.otherDeduction = otherDeduction;
    }
    public int getTotalDeduction() {
        return totalDeduction;
    }
    public void setTotalDeduction(int totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    
}
