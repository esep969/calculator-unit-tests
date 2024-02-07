package com.epam.svitlana_kryvchykova.calculator.power;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowDoubleUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/power/power_double.csv", numLinesToSkip = 1)
    @DisplayName("double pow() positive cases")
    public void testPowDoublePositiveCases(double a, double b, double expected) {
        double actual = CALCULATOR.pow(a, b);
        assertEquals(expected, actual);
    }
}
