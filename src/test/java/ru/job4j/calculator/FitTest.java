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

    // Calculate ideal weight for women with height equal to 110
    @Test
    public void testWomanWeightHeightEqualTo110() {
        // Arrange
        short input = 110;
        double expected = 0;

        // Act
        double output = Fit.womanWeight(input);

        // Assert
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    // Calculate ideal weight for men with height smaller than 100
    @Test
    public void testManWeightHeightSmallerThan100() {
        // Arrange
        short input = 99;
        double expected = -15;

        // Act
        double output = Fit.manWeight(input);

        // Assert
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    // Calculating woman's ideal weight with a negative input height
    @Test
    public void testWomanWeightNegativeInput() {
        // Arrange
        short input = -150;
        double expected = -316.5;

        // Act
        double output = Fit.womanWeight(input);

        // Assert
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    // Calculating man's ideal weight with a negative input height
    @Test
    public void testManWeightNegativeInput() {
        // Arrange
        short input = -150;
        double expected = -287.5;

        // Act
        double output = Fit.manWeight(input);

        // Assert
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    // Test the manWeight method with a height of 100, expecting a weight of -15.
    @Test
    public void whenMan100ThenMinus15() {
        // Arrange
        short input = 100;
        double expected = -15;

        // Act
        double output = Fit.manWeight(input);

        // Assert
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}