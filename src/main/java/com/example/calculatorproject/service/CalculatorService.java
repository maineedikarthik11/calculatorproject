package com.example.calculatorproject.service;

import com.example.calculatorproject.exceptions.ArithmeticExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public ResponseEntity<Double> addition(double firstNumber,double secondNumber) {
        double addition = firstNumber+secondNumber;
        return ResponseEntity.ok(addition);
    }

    public ResponseEntity<Double> subtraction(double firstNumber,double secondNumber) {
        return ResponseEntity.ok(firstNumber-secondNumber);
    }
    public ResponseEntity<Double> multiplication(double firstNumber,double secondNumber) {
        return ResponseEntity.ok(firstNumber*secondNumber);
    }
    public ResponseEntity<Double> division(double firstNumber, double secondNumber) {
        if(secondNumber==0){
            throw new ArithmeticExceptionHandler("Number cannot be divided by zero");
        }else {
            return ResponseEntity.ok(firstNumber / secondNumber);
        }
    }
}
