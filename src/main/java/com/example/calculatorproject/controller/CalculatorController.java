package com.example.calculatorproject.controller;

import com.example.calculatorproject.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/addition")
    public ResponseEntity<Double> addition(@RequestParam("firstNumber") Double firstNumber, @RequestParam("secondNumber") Double secondNumber){
        if(firstNumber==null||secondNumber==null){
            return ResponseEntity.badRequest().build();
        }
        return calculatorService.addition(firstNumber,secondNumber);
    }

    @GetMapping("/subtraction")
    public ResponseEntity<Double> subtraction(@RequestParam("firstNumber") Double firstNumber, @RequestParam("secondNumber") Double secondNumber){
        if(firstNumber==null||secondNumber==null){
            return ResponseEntity.badRequest().build();
        }
        return calculatorService.subtraction(firstNumber,secondNumber);
    }
    @GetMapping("/multiplication")
    public ResponseEntity<Double> multiplication(@RequestParam("firstNumber") Double firstNumber, @RequestParam("secondNumber") Double secondNumber){
        if(firstNumber==null||secondNumber==null){
            return ResponseEntity.badRequest().build();
        }
        return calculatorService.multiplication(firstNumber,secondNumber);
    }
    @GetMapping("/division")
    public ResponseEntity<Double> division(@RequestParam("firstNumber") Double firstNumber, @RequestParam("secondNumber") Double secondNumber){
        if(firstNumber==null||secondNumber==null){
            return ResponseEntity.badRequest().build();
        }
        return calculatorService.division(firstNumber,secondNumber);
    }
}
