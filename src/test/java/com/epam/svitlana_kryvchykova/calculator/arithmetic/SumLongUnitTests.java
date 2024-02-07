package com.epam.svitlana_kryvchykova.calculator.arithmetic;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumLongUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/arithmetic/sum_long.csv", numLinesToSkip = 1)
    @DisplayName("long sum(long a, long b) positive cases")
    public void testSumLongPositiveCases(long a, long b, long expected){
        long actual = CALCULATOR.sum(a, b);
        assertEquals(expected, actual);
    }
}
