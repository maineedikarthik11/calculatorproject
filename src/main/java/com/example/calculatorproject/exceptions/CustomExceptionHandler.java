package com.example.calculatorproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ArithmeticExceptionHandler.class)
    private final ResponseEntity<ErrorMessage> handleArithmeticException(ArithmeticExceptionHandler e){
        ErrorMessage errorMessage=new ErrorMessage(500,"INTERNAL_SERVER_ERROR",e.getMessage());
        return new ResponseEntity<>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
