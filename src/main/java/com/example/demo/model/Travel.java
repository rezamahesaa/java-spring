package com.example.demo.model;

import java.time.LocalDate;

public class Travel {
    private Integer id;
    private Integer employeeId;
    private Integer hotelExpense;
    private Integer transportExpense;
    private Integer otherExpense;
    private Integer totalExpense;
    private LocalDate submitDate;

    public Travel(Integer id, Integer employeeId, Integer hotelExpense, Integer transportExpense, Integer otherExpense, Integer totalExpense,
        LocalDate submitDate) {
    this.id = id;
    this.employeeId = employeeId;
    this.hotelExpense = hotelExpense;
    this.transportExpense = transportExpense;
    this.otherExpense = otherExpense;
    this.totalExpense = totalExpense;
    this.submitDate = submitDate;
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
    public Integer getHotelExpense() {
        return hotelExpense;
    }
    public void setHotelExpense(Integer hotelExpense) {
        this.hotelExpense = hotelExpense;
    }
    public Integer getTransportExpense() {
        return transportExpense;
    }
    public void setTransportExpense(Integer transportExpense) {
        this.transportExpense = transportExpense;
    }
    public Integer getOtherExpense() {
        return otherExpense;
    }
    public void setOtherExpense(Integer otherExpense) {
        this.otherExpense = otherExpense;
    }
    public Integer getTotalExpense() {
        return totalExpense;
    }
    public void setTotalExpense(Integer totalExpense) {
        this.totalExpense = totalExpense;
    }
    public LocalDate getSubmitDate() {
        return submitDate;
    }
    public void setSubmitDate(LocalDate submitDate) {
        this.submitDate = submitDate;
    }
}
