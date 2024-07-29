package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_tr_travel")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id; 
    
    @Column
    private Integer hotelExpense;

    @Column
    private Integer transportExpense;

    @Column
    private Integer otherExpense;

    @Column
    private Integer totalExpense;

    @Column
    private LocalDate submitDate;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    public Travel(Integer id, Employee employee, Integer hotelExpense, Integer transportExpense, Integer otherExpense, Integer totalExpense,
        LocalDate submitDate) {
    this.id = id;
    this.employee = employee;
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
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
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
