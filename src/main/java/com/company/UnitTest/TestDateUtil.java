package main.java.com.company.UnitTest;

import com.sun.media.sound.InvalidFormatException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateUtil extends TestCase {
    DateUtils dateUtils;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String dateInString = "2013/06/07 23:30:59";
    Date date;

    @BeforeEach
    public void setUp() throws ParseException {
        dateUtils = new DateUtils();
        date = formatter.parse(dateInString);
    }
    @Test
    public void whenDerivedExceptionThrown_thenAssertionSucceds() {
//        Exception exception = assertThrows(RuntimeException.class, () -> {
//            Integer.parseInt("1a");
//        });

//        String expectedMessage = "For input string";
//        String actualMessage = exception.getMessage();
//
//        assertTrue(actualMessage.contains(expectedMessage));
    }

//    @Test
//    public void test() throws FormatInvalidException {
//       try {
//           Assert.assertEquals("2013/06/07", dateUtils.formatDate(date, "YYYY/MM/dd"));
//           Assert.assertEquals("2013/06/07 11:30:59", dateUtils.formatDate(date, "yyyy/MM/dd hh:mm:ss"));
//           Assert.assertEquals("2013年06月07日", dateUtils.formatDate(date, "yyyy年MM月dd日"));
//           Assert.assertEquals("2013年06月07日", dateUtils.formatDate(date, "yyyyAMMBdd日"));
//       }catch (FormatInvalidException formatInvalidException){
//
//       }
//    }
}
