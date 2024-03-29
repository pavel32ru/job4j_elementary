package ru.job4j.calculator;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

public class FitTest {

    @Test
    public void whenMan200Then90() {
        short input = 200;
        double expected = 90;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenWoman167Then90() {
        short input = 167;
        double expected = 90;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}