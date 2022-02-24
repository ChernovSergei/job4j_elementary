package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = new int[]{1, 2, 3};
        int[] right = new int[]{5, 4, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = new int[]{1, 2, 3};
        int[] right = new int[]{3, 3, 4};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}