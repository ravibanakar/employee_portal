package com.emp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    /**
     * This exception method is invoked with application custom exception.
     *
     * @param e
     * @return
     */
    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<ErrorMessage> handleEmployeeException(EmployeeException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getErrorCode(), e.getErrorMessage());
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    /**
     * This method is invoked when there is no matching exception caught in the application.
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> handleException(Exception ex) {
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), "General Exception");
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
