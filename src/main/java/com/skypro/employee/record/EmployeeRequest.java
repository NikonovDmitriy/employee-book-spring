package com.skypro.employee.record;

public class EmployeeRequest {

    private String firstName;
    private String lsatName;
    private int department;
    private int salary;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLsatName() {
        return lsatName;
    }

    public void setLsatName(String lsatName) {
        this.lsatName = lsatName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int departament) {
        this.department = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
