package ru.job4j.calculator;

import  static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return firstSubSecond(first, second) + firstDivideSecond(first, second);
    }

    public  static double totalSum(double first, double second) {
        return  sumAndMultiply(first, second) + subAndDivision(first, second);
    }

    public  static void main(String[] args) {
        System.out.println("sumAndMultiply is " + sumAndMultiply(10, 20));
        System.out.println("subAndDivision is " + subAndDivision(20, 10));
        System.out.println("totalSum equals to " + totalSum(20, 10));
    }
}
