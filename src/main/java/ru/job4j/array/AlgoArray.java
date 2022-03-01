package ru.job4j.array;

public class AlgoArray {
    public static int[] swapArrayElements(int first, int second, int[] array) {
        int variable = array[first];
        array[first] = array[second];
        array[second] = variable;
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        array = swapArrayElements(0, 3, array);
        array = swapArrayElements(3, 4, array);
        array = swapArrayElements(1, 2, array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
