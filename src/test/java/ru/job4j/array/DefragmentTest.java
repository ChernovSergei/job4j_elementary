package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] array = {null, "I"};
        String[] result = Defragment.compress(array);
        String[] expected = {"I", null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notFirstNull() {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void firstNull() {
        String[] array = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notAllNull() {
        String[] array = {null, null, null};
        String[] result = Defragment.compress(array);
        String[] expected = {null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] array = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }
}