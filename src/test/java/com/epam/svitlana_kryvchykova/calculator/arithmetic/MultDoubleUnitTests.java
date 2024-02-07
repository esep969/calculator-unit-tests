package com.epam.svitlana_kryvchykova.calculator.arithmetic;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultDoubleUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/arithmetic/mult_double.csv", numLinesToSkip = 1)
    @DisplayName("double mult(double a, double b) positive cases")
    public void testMultDoublePositiveCases(double a, double b, double expected) {
        double actual = CALCULATOR.mult(a, b);
        assertEquals(expected, actual);
    }
}
