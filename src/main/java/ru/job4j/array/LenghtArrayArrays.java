package ru.job4j.array;

public class LenghtArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array size = " + numbers[i].length);
        }
    }
}
