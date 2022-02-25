package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] array) {
        boolean test = array[0];
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != test) {
                result = false;
                break;
            }
        }
        return result;
    }
}
