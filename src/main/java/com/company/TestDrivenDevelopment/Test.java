package com.company.TestDrivenDevelopment;

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
                " _  \n" +
                "| | \n" +
                "|_| ";

        assertEquals(finalResult, lcdNumber.generate(0));
    }

    public void test_number_1() {
        String finalResult =
                "    \n" +
                "  | \n" +
                "  | ";

        assertEquals(finalResult, lcdNumber.generate(1));
    }

    public void test_number_12() {
        String finalResult =
                "     _  \n" +
                "  |  _| \n" +
                "  | |__ " ;

        assertEquals(finalResult, lcdNumber.generate(12));
    }

    public void test_number_201() {
        String finalResult =
                " _   _      \n" +
                " _| | |   | \n" +
                "|__ |_|   | ";

        assertEquals(finalResult, lcdNumber.generate(201));
    }

    public void test_number_121() {
        String finalResult =
                "\n" +
                "\n" +
                "";

        assertEquals(finalResult, lcdNumber.generate(121));
    }
}
