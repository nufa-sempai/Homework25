package com.example.homework25.service;

import com.example.homework25.exception.DivByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0){
            throw new  DivByZeroException();
        }
        return  a / b;
    }
}