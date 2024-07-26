package com.example.demo.model;

public class Insurance {
    private int id;
    private int employeeId;
    private String medicalInformation;
    private int expense;
    private String submitDate;
    
    public Insurance(int id, int employeeId, String medicalInformation, int expense, String submitDate) {
        this.id = id;
        this.employeeId = employeeId;
        this.medicalInformation = medicalInformation;
        this.expense = expense;
        this.submitDate = submitDate;
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
    public String getMedicalInformation() {
        return medicalInformation;
    }
    public void setMedicalInformation(String medicalInformation) {
        this.medicalInformation = medicalInformation;
    }
    public int getExpense() {
        return expense;
    }
    public void setExpense(int expense) {
        this.expense = expense;
    }
    public String getSubmitDate() {
        return submitDate;
    }
    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }
    
}
