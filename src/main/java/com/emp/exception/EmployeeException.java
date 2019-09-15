package com.emp.exception;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class EmployeeException extends Exception {

    private static final long serialVersionUID = 1231441414141L;

    private int errorCode;
    private String errorMessage;

    public EmployeeException() {

    }

    public EmployeeException(int errorCode) {
        this.errorCode = errorCode;
    }

    public EmployeeException(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
