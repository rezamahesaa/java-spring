package com.example.demo.model;

public class Deduction {
    private Integer id;
    private Integer employeeId;
    private Integer tax;
    private Integer otherDeduction;
    private Integer totalDeduction;
    
    public Deduction(Integer id, Integer employeeId, Integer tax, Integer otherDeduction, Integer totalDeduction) {
        this.id = id;
        this.employeeId = employeeId;
        this.tax = tax;
        this.otherDeduction = otherDeduction;
        this.totalDeduction = totalDeduction;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Integer getTax() {
        return tax;
    }
    public void setTax(Integer tax) {
        this.tax = tax;
    }
    public Integer getOtherDeduction() {
        return otherDeduction;
    }
    public void setOtherDeduction(Integer otherDeduction) {
        this.otherDeduction = otherDeduction;
    }
    public Integer getTotalDeduction() {
        return totalDeduction;
    }
    public void setTotalDeduction(Integer totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    
}
