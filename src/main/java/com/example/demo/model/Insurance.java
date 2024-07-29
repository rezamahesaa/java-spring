package com.example.demo.model;

import java.time.LocalDate;

public class Insurance {
    private Integer id;
    private Integer employeeId;
    private String medicalInformation;
    private Integer expense;
    private LocalDate submitDate;
    
    public Insurance(Integer id, Integer employeeId, String medicalInformation, Integer expense, LocalDate submitDate) {
        this.id = id;
        this.employeeId = employeeId;
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
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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
