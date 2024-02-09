package com.example.calculatorproject.service;

import com.example.calculatorproject.exceptions.ArithmeticExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public ResponseEntity<Double> addition(Double firstNumber,Double secondNumber) {
        Double addition = firstNumber+secondNumber;
        return ResponseEntity.ok(addition);
    }

    public ResponseEntity<Double> subtraction(Double firstNumber,Double secondNumber) {
        return ResponseEntity.ok(firstNumber-secondNumber);
    }
    public ResponseEntity<Double> multiplication(Double firstNumber,Double secondNumber) {
        return ResponseEntity.ok(firstNumber*secondNumber);
    }
    public ResponseEntity<Double> division(Double firstNumber, Double secondNumber) {
        if(secondNumber==0){
            throw new ArithmeticExceptionHandler("Number cannot be divided by zero");
        }else {
            return ResponseEntity.ok(firstNumber / secondNumber);
        }

    }
}
