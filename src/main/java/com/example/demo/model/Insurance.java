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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    private String medicalInformation;

    @Column
    private Integer expense;

    @Column
    private LocalDate submitDate;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Employee employee;
    
    public Insurance(Integer id, Employee employee, String medicalInformation, Integer expense, LocalDate submitDate) {
        this.id = id;
        this.employee = employee;
        this.medicalInformation = medicalInformation;
        this.expense = expense;
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
