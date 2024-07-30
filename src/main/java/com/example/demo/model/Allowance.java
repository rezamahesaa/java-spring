package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tbl_tr_allowance")
public class Allowance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "total_insurance_expense")
    private Integer totalInsuranceExpense;

    @Column
    private Integer thr;

    @Column(name = "total_travel_expense")
    private Integer totalTravelExpense;

    @Column(name = "total_allowance")
    private Integer totalAllowance;   

    @OneToMany(mappedBy = "allowance")
    // @JsonIgnore
    private List<Travel> travels;

    @OneToMany(mappedBy = "allowance")
    // @JsonIgnore
    private List<Insurance> insurances;

    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    public Allowance(Integer id, Employee employee, Integer totalInsuranceExpense, Integer thr, Integer totalTravelExpense,
            Integer totalAllowance) {
        this.id = id;
        this.employee = employee;
        this.totalInsuranceExpense = totalInsuranceExpense;
        this.thr = thr;
        this.totalTravelExpense = totalTravelExpense;
        this.totalAllowance = totalAllowance;
    }    

    public Allowance() {
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

    public List<Travel> getTravels() {
        return travels;
    }

    public void setTravels(List<Travel> travels) {
        this.travels = travels;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    
}
