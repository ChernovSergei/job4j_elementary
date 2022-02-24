package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWidth(char[] word, char[] pref) {
        boolean result = true;
        int lettersQty = word.length > pref.length ? pref.length : word.length;
        for (int i = 0; i < lettersQty; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
