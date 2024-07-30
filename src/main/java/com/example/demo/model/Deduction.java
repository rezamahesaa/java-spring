package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_m_deduction")
public class Deduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private Integer tax;

    @Column(name = "other_deduction")
    private Integer otherDeduction;

    @Column(name = "total_deduction")
    private Integer totalDeduction;
    
    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    public Deduction(Integer id, Employee employee, Integer tax, Integer otherDeduction, Integer totalDeduction) {
        this.id = id;
        this.employee = employee;
        this.tax = tax;
        this.otherDeduction = otherDeduction;
        this.totalDeduction = totalDeduction;
    }

    public Deduction() {
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
