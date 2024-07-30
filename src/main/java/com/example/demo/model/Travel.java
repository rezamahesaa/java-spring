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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id; 
    
    @Column(name = "hotel_expense")
    private Integer hotelExpense;

    @Column(name = "transport_expense")
    private Integer transportExpense;

    @Column(name = "other_expense")
    private Integer otherExpense;

    @Column(name = "total_expense")
    private Integer totalExpense;

    @Column(name = "submit_date")
    private LocalDate submitDate;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Allowance allowance;

    public Travel(Integer id, Allowance allowance, Integer hotelExpense, Integer transportExpense, Integer otherExpense, Integer totalExpense,
        LocalDate submitDate) {
    this.id = id;
    this.allowance = allowance;
    this.hotelExpense = hotelExpense;
    this.transportExpense = transportExpense;
    this.otherExpense = otherExpense;
    this.totalExpense = totalExpense;
    this.submitDate = submitDate;
    }

    public Travel() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Allowance getAllowance() {
        return allowance;
    }
    public void setAllowance(Allowance allowance) {
        this.allowance = allowance;
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
