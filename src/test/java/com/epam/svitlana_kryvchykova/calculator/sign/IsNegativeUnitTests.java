package com.epam.svitlana_kryvchykova.calculator.sign;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsNegativeUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/sign/negative_values.csv", numLinesToSkip = 1)
    @DisplayName("boolean isNegative() - negative values")
    public void testIsNegativePositiveValues(long a) {
        boolean actual = CALCULATOR.isNegative(a);
        assertTrue(actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/sign/positive_values.csv", numLinesToSkip = 1)
    @DisplayName("boolean isNegative() - positive values")
    public void testIsNegativeNegativeValues(long a) {
        boolean actual = CALCULATOR.isNegative(a);
        assertFalse(actual);
    }

    @Test
    @DisplayName("boolean isNegative() - zero")
    public void testIsNegativeZero() {
        boolean actual = CALCULATOR.isNegative(0);
        assertFalse(actual);
    }

}
