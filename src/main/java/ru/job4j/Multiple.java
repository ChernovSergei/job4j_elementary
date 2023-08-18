package ru.job4j;

import java.io.FileOutputStream;

public class Multiple {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("data/dataResult.txt")) {
            for (int i = 2; i < 10; i++) {
                out.write(("1 * " + i + " = " + i).getBytes());
                out.write(System.lineSeparator().getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
