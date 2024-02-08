package com.example.calculatorproject.exceptions;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {

    private int statusCode;
    private String Message;
    private String details;

}
