package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        int result = PrimeNumber.calc(number);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when11() {
        int number = 11;
        int result = PrimeNumber.calc(number);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int number = 2;
        int result = PrimeNumber.calc(number);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}