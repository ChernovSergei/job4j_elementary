package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5To9Then9() {
        int left = 5;
        int right = 9;
        int expected = 9;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}