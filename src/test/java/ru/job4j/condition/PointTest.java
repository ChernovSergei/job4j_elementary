package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to44then5p65() {
        double expected = 5.65;
        Point a = new Point(0, 0);
        Point b = new Point(4, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when710to7minus4then14() {
        double expected = 14;
        Point a = new Point(7, 10);
        Point b = new Point(7, -4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to4040then42p42() {
        double expected = 42.42;
        Point a = new Point(10, 10);
        Point b = new Point(40, 40);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when101010to404040then51p96() {
        double expected = 51.96;
        Point a = new Point(10, 10, 10);
        Point b = new Point(40, 40, 40);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when102030to405060then51p96() {
        double expected = 51.96;
        Point a = new Point(10, 20, 30);
        Point b = new Point(40, 50, 60);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}