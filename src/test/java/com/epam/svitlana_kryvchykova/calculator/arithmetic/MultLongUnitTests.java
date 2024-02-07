package com.epam.svitlana_kryvchykova.calculator.arithmetic;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultLongUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/arithmetic/mult_long.csv", numLinesToSkip = 1)
    @DisplayName("long mult(long a, long b) positive cases")
    public void testMultLongPositiveCases(long a, long b, long expected) {
        long actual = CALCULATOR.mult(a, b);
        assertEquals(expected, actual);
    }
}
