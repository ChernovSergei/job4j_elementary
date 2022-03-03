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

    @Test
    public void whenMax5To9To12Then12() {
        int first = 5;
        int second = 9;
        int third = 12;
        int expected = 12;
        int result = Max.max(first, second, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax24To1To12To4Then24() {
        int first = 24;
        int second = 1;
        int third = 12;
        int fourth = 4;
        int expected = 24;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }
}