package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = new int[]{1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] expected = new int[]{4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, source, dest);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to5() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int dest = 5;
        int[] expected = new int[]{1, 2, 6, 4, 5, 3, 7};
        int[] result = SwitchArray.swap(input, source, dest);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int source = 1;
        int dest = 4;
        int[] expected = new int[]{1, 5, 3, 4, 2, 6, 7};
        int[] result = SwitchArray.swap(input, source, dest);
        Assert.assertArrayEquals(expected, result);
    }

}