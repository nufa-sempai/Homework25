package com.example.homework25.controller;

import com.example.homework25.service.CalculatorInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class CalculatorController {
    private final CalculatorInterface calculatorInterface;

    public CalculatorController(CalculatorInterface calculatorInterface) {
        this.calculatorInterface = calculatorInterface;
    }

    @GetMapping
    public String welcome(){
        return "Welcome to calculator";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam (value = "num1", required = false) Integer a,
                       @RequestParam (value = "num2", required = false) Integer b){
        if (Objects.isNull(a) || Objects.isNull(b)){
            return "Оба параметра должны быть переданы";
        }
        return a + " + " + b + " = " + calculatorInterface.plus(a,b);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam (value = "num1", required = false) Integer a,
                        @RequestParam (value = "num2", required = false) Integer b){
        if (Objects.isNull(a) || Objects.isNull(b)){
            return "Оба параметра должны быть переданы";
        }
        return a + " + " + b + " = " + calculatorInterface.minus(a,b);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam (value = "num1", required = false) Integer a,
                           @RequestParam (value = "num2", required = false) Integer b){
        if (Objects.isNull(a) || Objects.isNull(b)){
            return "Оба параметра должны быть переданы";
        }
        return a + " * " + b + " = " + calculatorInterface.multiply(a,b);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam (value = "num1", required = false) Integer a,
                         @RequestParam (value = "num2", required = false) Integer b){
        if (Objects.isNull(a) || Objects.isNull(b)){
            return "Оба параметра должны быть переданы";
        }

        return a + " / " + b + " = " + calculatorInterface.divide(a,b);
    }
}