package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] array = new boolean[]{true, true, true};
        boolean result = Check.mono(array);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] array = new boolean[]{true, false, true};
        boolean result = Check.mono(array);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] array = new boolean[]{false, false, false};
        boolean result = Check.mono(array);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        boolean[] array = new boolean[]{false, true, false};
        boolean result = Check.mono(array);
        Assert.assertFalse(result);
    }
}