package ru.job4j.array;

public class EndsWith {
    public static boolean endsWidth(char[] word, char[] post) {
        boolean result = true;
        int len = word.length > post.length ? post.length : word.length;
        for (int i = 0; i < len; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
