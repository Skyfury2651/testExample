package com.company.TestDrivenDevelopment;

public class LCDNumber {
    public String[] NumberZero = {" ", "_", " ", "|", " ", "|", "|", "_", "|"};
    public String[] NumberOne  = {" ", " ", " ", " ", " ", "|", " ", " ", "|"};
    public String[] NumberTwo  = {" ", "_", " ", " ", "_", "|", "|", "_", "_"};

    public String generate(Number number) {
        String numberStr = String.valueOf(number);


       String[] multiDimension = new String[3];
        multiDimension[0] = "";
        multiDimension[1] = "";
        multiDimension[2] = "";

        for (int i = 0; i < numberStr.length(); i++) {
            Character text = numberStr.charAt(i);

            if (text.equals('0')) {
                multiDimension[0] += NumberZero[0] + NumberZero[1] + NumberZero[2] + " ";
                multiDimension[1] += NumberZero[3] + NumberZero[4] + NumberZero[5] + " ";
                multiDimension[2] += NumberZero[6] + NumberZero[7] + NumberZero[8] + " ";
            }

            if (text.equals('1')) {
                multiDimension[0] += NumberOne[0] + NumberOne[1] + NumberOne[2] + " ";
                multiDimension[1] += NumberOne[3] + NumberOne[4] + NumberOne[5] + " ";
                multiDimension[2] += NumberOne[6] + NumberOne[7] + NumberOne[8] + " ";
            }

            if (text.equals('2')) {
                multiDimension[0] += NumberTwo[0] + NumberTwo[1] + NumberTwo[2] + " ";
                multiDimension[1] += NumberTwo[3] + NumberTwo[4] + NumberTwo[5] + " ";
                multiDimension[2] += NumberTwo[6] + NumberTwo[7] + NumberTwo[8] + " ";
            }
        }
        System.out.println(multiDimension[0]);
        System.out.println(multiDimension[1]);
        System.out.println(multiDimension[2]);
        String finalStr = multiDimension[0] + "\n" +  multiDimension[1] + "\n" + multiDimension[2];

        return finalStr;
    }
}
