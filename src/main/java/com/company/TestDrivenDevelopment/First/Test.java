package com.company.TestDrivenDevelopment.First;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeAll;

public class Test extends TestCase {
    private LCDNumber lcdNumber;

    @BeforeAll
    public void setUp() {
        lcdNumber = new LCDNumber();
    }

    public void test_number_0() {
        String finalResult =
                " _ \n" +
                "| |\n" +
                "|_|";

        assertEquals(finalResult, lcdNumber.generate(0));
    }

    public void test_number_1() {
        String finalResult =
                "   \n" +
                "  |\n" +
                "  |";

        assertEquals(finalResult, lcdNumber.generate(1));
    }
}
