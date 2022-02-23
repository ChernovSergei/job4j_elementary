package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 == 0 && number % 3 == 0) {
            rsl = "The number is multiple of 6.";
        } else if (number % 3 == 0) {
            rsl = "The number is multiple of 3, but it isn't even.";
        } else if (number % 2 == 0) {
            rsl = "The number is even, but it isn't multiple of 3.";
        } else {
            rsl = "The number is odd and it isn't multiple of 3.";
        }
        return rsl;
    }
}
