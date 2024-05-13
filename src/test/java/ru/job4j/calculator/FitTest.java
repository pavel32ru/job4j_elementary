package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void whenMan200Then90() {
        short input = 200;
        double expected = 90;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenWoman167Then63() {
        short input = 167;
        double expected = 63;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void testWomanWeightHeightEqualTo110() {
        short input = 110;
        double expected = 63;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void testManWeightHeightSmallerThan100() {
        short input = 99;
        double expected = 90;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void testWomanWeightNegativeInput() {
        short input = -150;
        double expected = 63;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void testManWeightNegativeInput() {
        short input = -150;
        double expected = 90;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenMan100ThenMinus15() {
        short input = 100;
        double expected = 90;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}