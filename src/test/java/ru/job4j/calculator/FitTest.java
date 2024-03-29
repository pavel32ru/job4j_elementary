package ru.job4j.calculator;


import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short input = 180;
        double expected = 90;
        double out = Fit.manWeight(input);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short input = 167;
        double expected = 63;
        double out = Fit.womanWeight(input);
        Assert.assertEquals(expected, out, 0.01);
    }
}