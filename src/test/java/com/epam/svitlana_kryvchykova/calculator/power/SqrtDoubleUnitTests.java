package com.epam.svitlana_kryvchykova.calculator.power;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SqrtDoubleUnitTests extends BaseUnitTests {
    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/power/sqrt_double.csv", numLinesToSkip = 1)
    @DisplayName("double sqrt() positive cases")
    public void testSqrtDoublePositiveCases(double a, double expected){
      double actual = CALCULATOR.sqrt(a);
      assertEquals(expected, actual);

    }

    @Test
    @DisplayName("double sqrt negative() negative cases")
    public void testSqrtNegativeDoublePositiveCases(){
        double a = -9.9;
        assertThrows(NumberFormatException.class, () -> new Calculator().sqrt(a));

    }
}
