package com.epam.svitlana_kryvchykova.calculator.trigonometric;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/trigonometric/sin.csv", numLinesToSkip = 1)
    @DisplayName("double sin() positive cases")
    public void testSinDoublePositiveCases(double a, double expected) {
        double actual = CALCULATOR.sin(a);
        assertEquals(expected, actual);
    }
}
