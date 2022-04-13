package com.company.TestDrivenDevelopment.First;

public class LCDNumber {
    public String[] NumberZero = {" ", "_", "", "|", " ", "|", "|", "_", "|"};
    public String[] NumberOne = {" ", " ", " ", " ", " ", " |", " ", " ", " |"};
    public String[] NumberTwo = {" ", "_", " ", " ", "_", "|", "|", "_", "_"};

    public String generate(Number number) {
        String finalResult =
                " _ \n" +
                "| |\n" +
                "|_|";

        if (number.equals(1)) {
            finalResult =
              "   \n" +
              "  |\n" +
              "  |";
        }

        return finalResult;
    }
}
