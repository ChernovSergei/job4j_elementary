package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] array) {
        boolean test = array[0];
        boolean result = true;
        for (boolean element: array) {
            if (!element == test) {
                result = false;
                break;
            }
        }
        return result;
    }
}
