package com.skypro.employee.service;

import com.skypro.employee.dto.EmployeeRequest;
import com.skypro.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();
    Employee addEmployee(EmployeeRequest employeeRequest);
    Employee getEmployeeWithMinSalary();
    Employee getEmployeeWithMaxSalary();
    List<Employee> getEmployeesWithSalaryMoreAverage();
    int getSumOfSalaries();
}