package com.epam.svitlana_kryvchykova.calculator.arithmetic;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivLongUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/arithmetic/div_long.csv", numLinesToSkip = 1)
    @DisplayName("long div(long a, long b) positive cases")
    public void testDivLongPositiveCases(long a, long b, long expected) {
        long actual = CALCULATOR.div(a, b);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("long div(long a, long b) negative cases")
    public void testDivZeroLongNegativeCases() {
        long a = 6;
        long b = 0;
        assertThrows(NumberFormatException.class, () -> CALCULATOR.div(a, b));
    }
}
