package com.epam.svitlana_kryvchykova.calculator.trigonometric;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TgUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/trigonometric/tg.csv", numLinesToSkip = 1)
    @DisplayName("double tg() positive cases")
    public void testSinDoublePositiveCases(double a, double expected) {
        double actual = CALCULATOR.tg(a);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalid_data/trigonometric/tg.csv", numLinesToSkip = 1)
    @DisplayName("double tg() - infinity")
    public void testTgInfinity(double a) {
        assertThrows(NumberFormatException.class, () -> CALCULATOR.tg(a));
    }



}
