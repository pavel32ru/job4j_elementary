package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class RectangleAreaTest  {
    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = RectangleArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square3() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = RectangleArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K2Square2dot56() {
        double expected = 2.56;
        int p = 8;
        double k = 4;
        double out = RectangleArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}