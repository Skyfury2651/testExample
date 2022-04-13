package com.company.UnitTest;


import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtils {
    public String formatDate(Date inputDate,String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        return simpleDateFormat.format(inputDate);
    }
}
