package com.greatersum.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {
    @Test
    public void EmptyStringIsZero() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertThat(stringCalculator.add(""), is(0));
    }
}
