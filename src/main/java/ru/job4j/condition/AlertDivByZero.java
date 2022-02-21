package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Couldn't divide by zero.");
        }
        if (number < 0) {
            System.out.println("This is negative nuber");
        }
    }

    public static void main(String[] args) {
        possibleDiv(8);
        possibleDiv(0);
        possibleDiv(-2);
    }
}
