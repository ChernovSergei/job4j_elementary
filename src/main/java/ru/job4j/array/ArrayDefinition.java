package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Vanya";
        names[1] = "Ibrahim";
        names[2] = "Osaka";
        names[3] = "Mike";

        System.out.println("Ages array size = " + ages.length);
        System.out.println("Surnames array size = " + surnames.length);
        System.out.println("Prices array size = " + prices.length);
        System.out.println();

        for (String name: names) {
            System.out.println(name);
        }
    }
}
