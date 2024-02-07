package com.epam.svitlana_kryvchykova.calculator.trigonometric;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CtgUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/trigonometric/ctg.csv", numLinesToSkip = 1)
    @DisplayName("double ctg(double a) positive cases")
    public void testCtgDoublePositiveCases(double a, double expected) {
        double actual = CALCULATOR.ctg(a);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalid_data/trigonometric/ctg.csv", numLinesToSkip = 1)
    @DisplayName("double ctg() - infinity")
    public void testCtgInfinity(double a) {
        assertThrows(NumberFormatException.class, () -> CALCULATOR.ctg(a));
    }


}
