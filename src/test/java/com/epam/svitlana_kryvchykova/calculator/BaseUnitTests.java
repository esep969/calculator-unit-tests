package com.epam.svitlana_kryvchykova.calculator;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseUnitTests {

    protected static Calculator CALCULATOR;

    @BeforeAll
    public static void beforeAll() {
        CALCULATOR = new Calculator();
    }

    @BeforeEach
    public void beforeEach() throws InterruptedException {
        //TODO multi-thread demonstration
        //Thread.sleep(2000);
        //System.out.println("Thread.currentThread()" + Thread.currentThread().getId());
    }
}
