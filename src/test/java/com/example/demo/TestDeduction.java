package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Deduction;
import com.example.demo.model.Employee;
import com.example.demo.service.DeductionService;
import com.example.demo.service.EmployeeService;

@SpringBootTest
public class TestDeduction {
    @Autowired
    DeductionService deductionService;

    @Autowired
    EmployeeService employeeService;

    @Test
    void post(){
        Employee employee = employeeService.get(10);
        Deduction deduction = new Deduction(null, employee, 200000, 0, 200000);
        Boolean result = deductionService.save(deduction);
        assertEquals(true, result);
    }

    @Test
    void delete(){
        Integer id = 8;
        Boolean result = deductionService.delete(id);
        assertEquals(true, result);
    }

    @Test
    void get(){
        List<Deduction> listDeduction = deductionService.get();
        for (Deduction deduction : listDeduction) {
            System.out.println(deduction.getTotalDeduction());
        }
    }

}
