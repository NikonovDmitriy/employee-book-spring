package com.skypro.employee.exceptions;

public class IllegalNameException extends RuntimeException{

    public IllegalNameException() {
        super("Employee`s data must be valid");
    }
}
