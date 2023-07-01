package com.example.homework25;

import com.example.homework25.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CalculatorServiceParametrizedTest {
    CalculatorService calculatorService = new CalculatorService();
    public static Stream<Arguments> plusTestParams(){
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-1, 2, 1),
                Arguments.of(0, 0, 0)
        );
    }
    public static Stream<Arguments> minusTestParams(){
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(-1, 2, -3),
                Arguments.of(0, 0, 0)
        );
    }
    public static Stream<Arguments> multiplyTestParams(){
        return Stream.of(
                Arguments.of(4, 4, 16),
                Arguments.of(-3, -3, 9),
                Arguments.of(7, 0, 0)
        );
    }
    public static Stream<Arguments> divideTestParams(){
        return Stream.of(
                Arguments.of(3, 2, 1.5),
                Arguments.of(-2, 2, -1),
                Arguments.of(0, 2, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("plusTestParams")
    public void plusTest(int a, int b, int expected){
        Assertions.assertEquals(expected, calculatorService.plus(a, b));
    }
    @ParameterizedTest
    @MethodSource("minusTestParams")
    public void minusTest(int a, int b, int expected){
        Assertions.assertEquals(expected, calculatorService.minus(a, b));
    }
    @ParameterizedTest
    @MethodSource("multiplyTestParams")
    public void multiplyTest(int a, int b, int expected){
        Assertions.assertEquals(expected, calculatorService.multiply(a, b));
    }
    @ParameterizedTest
    @MethodSource("divideTestParams")
    public void divideTestParams(int a, int b, int expected) {
        Assertions.assertEquals(expected, calculatorService.divide(a, b));
    }
}