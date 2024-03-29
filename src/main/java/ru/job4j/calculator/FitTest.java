package ru.job4j.calculator;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short input = 180;
        double expected = 90;
        double output = ru.job4j.calculator.Fit.manWeight(input);
        AssertionsForClassTypes.assertThat(output).isEqualTo(expected, BDDAssertions.withPrecision(0.01));
    }

    @Test
    public void whenWoman170Then69() {
        short input = 167;
        double expected = 63;
        double output = ru.job4j.calculator.Fit.womanWeight(input);
        AssertionsForClassTypes.assertThat(output).isEqualTo(expected, BDDAssertions.withPrecision(0.01));
    }
}