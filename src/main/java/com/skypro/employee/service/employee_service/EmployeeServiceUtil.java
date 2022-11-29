package com.skypro.employee.service.employee_service;



import com.skypro.employee.dto.EmployeeRequest;
import com.skypro.employee.exceptions.IllegalNameException;
import com.skypro.employee.model.Employee;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class EmployeeServiceUtil {

    static Employee createEmployeeFromRequest(EmployeeRequest employeeRequest, int lastId) {
        validateEmployeeData(employeeRequest);
        return new Employee(++lastId,
                employeeRequest.getFirstName(),
                employeeRequest.getLastName(),
                employeeRequest.getSalary(),
                employeeRequest.getDepartment());
    }

    static void validateEmployeeData(EmployeeRequest employeeRequest) {
        final String firstName = employeeRequest.getFirstName();
        final String lastName = employeeRequest.getLastName();
        checkName(firstName, lastName);
        employeeRequest.setFirstName(StringUtils.capitalize(firstName));
        employeeRequest.setLastName(StringUtils.capitalize(lastName));
    }

    static void checkName(String firstName, String lastName) {
        if (StringUtils.isEmpty(firstName) || StringUtils.isEmpty(lastName)
                || !firstName.chars().allMatch(Character::isLetter)
                || !lastName.chars().allMatch(Character::isLetter)) {
            throw new IllegalNameException();
        }
    }

    static int averageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToInt(Employee::getEmployeeSalary)
                .sum()
                / employees.size();
    }
}
