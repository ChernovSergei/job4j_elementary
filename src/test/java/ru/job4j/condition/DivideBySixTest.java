package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number is multiple of 6.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number is multiple of 3, but it isn't even.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number is even, but it isn't multiple of 3.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number is odd and it isn't multiple of 3.";
        Assert.assertEquals(expected, result);
    }
}