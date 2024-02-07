package com.epam.svitlana_kryvchykova.calculator.arithmetic;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivDoubleUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/arithmetic/div_double.csv", numLinesToSkip = 1)
    @DisplayName("double div() positive cases")
    public void testDivDoublePositiveCases(double a, double b, double expected){
        double actual = CALCULATOR.div(a, b);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("double div() - zero")
    public void testDivZeroDoubleNegativeCases(){
        double a = 3.0;
        double b = 0.0;
        assertThrows(NumberFormatException.class, ()-> CALCULATOR.div(a, b));

    }
}
