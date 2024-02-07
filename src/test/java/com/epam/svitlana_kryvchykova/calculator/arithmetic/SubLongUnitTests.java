package com.epam.svitlana_kryvchykova.calculator.arithmetic;

import com.epam.svitlana_kryvchykova.calculator.BaseUnitTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubLongUnitTests extends BaseUnitTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_data/arithmetic/sub_long.csv", numLinesToSkip = 1)
    @DisplayName("long sub(long a, long b) positive cases")
    public void testSubLongPositiveCases(long a, long b, long expected) {
        long actual = CALCULATOR.sub(a, b);
        assertEquals(expected, actual);
    }
}
