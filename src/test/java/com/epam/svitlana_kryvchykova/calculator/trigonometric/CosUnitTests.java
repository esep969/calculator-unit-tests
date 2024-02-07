package com.epam.svitlana_kryvchykova.calculator.trigonometric;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/trigonometric/cos.csv", numLinesToSkip = 1)
    @DisplayName("double cos() positive cases")
    public void testCosDoublePositiveCases(double a, double expected){
        double actual = new Calculator().cos(a);
        assertEquals(expected, actual);
    }
}
