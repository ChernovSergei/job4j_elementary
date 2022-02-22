package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        int a = 2;
        int b = 2;
        int c = 2;
        boolean result = Triangle.exist(a, b, c);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        int a = 10;
        int b = 2;
        int c = 2;
        boolean result = Triangle.exist(a, b, c);
        Assert.assertFalse(result);
    }
}