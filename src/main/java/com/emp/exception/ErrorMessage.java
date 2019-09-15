package com.emp.exception;

import lombok.Data;

@Data
public class ErrorMessage {

    private int errorCode;
    private String errorMessage;

    public ErrorMessage(int errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorMessage(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
