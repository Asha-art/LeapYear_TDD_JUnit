package LeapYear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    @Test
    public void isLeapYear1996() {
        LeapYear leapyear = new LeapYear();
        Assert.assertEquals(true, leapyear.IsLeapYear(1996));
    }

    public void isLeapYear2001() {
        LeapYear leapyear = new LeapYear();
        Assert.assertEquals(false, leapyear.IsLeapYear(2001));
    }

    public void isLeapYear200() {
        LeapYear leapyear = new LeapYear();
        Assert.assertEquals(true, leapyear.IsLeapYear(2000));
    }

    public void isLeapYea1900() {
        LeapYear leapyear = new LeapYear();
        Assert.assertEquals(false, leapyear.IsLeapYear(1900));
    }
}
