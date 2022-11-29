package com.skypro.employee.service;

import com.skypro.employee.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DepartmentService {

    Set<Integer> getExistingDepartments();
    List<Employee> getEmployeesFromDepartment(int departmentId);
    Map<Integer, List<Employee>> getEmployeesByDepartment();
    int getSalarySumOfDepartment(int departmentId);
    int getMinSalaryOfDepartment(int departmentId);
    int getMaxSalaryOfDepartment(int departmentId);
}
