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
@Table(name = "tbl_tr_insurance")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "medical_information")
    private String medicalInformation;

    @Column
    private Integer expense;

    @Column(name = "submit_date")
    private LocalDate submitDate;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Allowance allowance;
    
    public Insurance(Integer id, Allowance allowance, String medicalInformation, Integer expense, LocalDate submitDate) {
        this.id = id;
        this.allowance = allowance;
        this.medicalInformation = medicalInformation;
        this.expense = expense;
        this.submitDate = submitDate;
    }

    public Insurance() {
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
    public String getMedicalInformation() {
        return medicalInformation;
    }
    public void setMedicalInformation(String medicalInformation) {
        this.medicalInformation = medicalInformation;
    }
    public Integer getExpense() {
        return expense;
    }
    public void setExpense(Integer expense) {
        this.expense = expense;
    }
    public LocalDate getSubmitDate() {
        return submitDate;
    }
    public void setSubmitDate(LocalDate submitDate) {
        this.submitDate = submitDate;
    }
    
}
