package com.epam.svitlana_kryvchykova.calculator.sign;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPositiveUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/sign/positive_values.csv", numLinesToSkip = 1)
    @DisplayName("boolean isPositive() - positive values")
    public void testIsPositivePositiveValues(long a) {
        boolean actual = CALCULATOR.isPositive(a);
        assertTrue(actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/sign/negative_values.csv", numLinesToSkip = 1)
    @DisplayName("boolean isPositive() - negative values")
    public void testIsPositiveNegativeValues(long a) {
        boolean actual = CALCULATOR.isPositive(a);
        assertFalse(actual);
    }

    @Test
    @DisplayName("boolean isPositive() - zero")
    public void testIsPositiveZero() {
        boolean actual = CALCULATOR.isPositive(0);
        assertTrue(actual);
    }

}
