package com.epam.svitlana_kryvchykova.calculator.arithmetic;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubDoubleUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/arithmetic/sub_double.csv", numLinesToSkip = 1)
    @DisplayName("double sub(double a, double b) positive cases")
    public void testSubDoublePositiveCases(double a, double b, double expected) {
        double actual = CALCULATOR.sub(a, b);
        assertEquals(expected, actual);
    }
}
