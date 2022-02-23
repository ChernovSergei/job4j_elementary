package ru.job4j.condition;

public class Counter {
    public static int sum(int start, int finish) {
        int rsl = 0;
        for (int i = start; i <= finish; i++) {
            rsl = rsl + i;
        }
        return rsl;
    }

    public static int sumByEven(int start, int finish) {
        int rsl = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                rsl = rsl + i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println();
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
