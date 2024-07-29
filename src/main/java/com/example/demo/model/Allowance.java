package com.example.demo.model;

public class Allowance {
    private Integer id;
    private Integer employeeId;
    private Integer totalInsuranceExpense;
    private Integer thr;
    private Integer totalTravelExpense;
    private Integer totalAllowance;   

    public Allowance(Integer id, Integer employeeId, Integer totalInsuranceExpense, Integer thr, Integer totalTravelExpense,
            Integer totalAllowance) {
        this.id = id;
        this.employeeId = employeeId;
        this.totalInsuranceExpense = totalInsuranceExpense;
        this.thr = thr;
        this.totalTravelExpense = totalTravelExpense;
        this.totalAllowance = totalAllowance;
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
    public Integer getTotalInsuranceExpense() {
        return totalInsuranceExpense;
    }
    public void setTotalInsuranceExpense(Integer totalInsuranceExpense) {
        this.totalInsuranceExpense = totalInsuranceExpense;
    }
    public Integer getThr() {
        return thr;
    }
    public void setThr(Integer thr) {
        this.thr = thr;
    }
    public Integer getTotalTravelExpense() {
        return totalTravelExpense;
    }
    public void setTotalTravelExpense(Integer totalTravelExpense) {
        this.totalTravelExpense = totalTravelExpense;
    }
    public Integer getTotalAllowance() {
        return totalAllowance;
    }
    public void setTotalAllowance(Integer totalAllowance) {
        this.totalAllowance = totalAllowance;
    }
}
