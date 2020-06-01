package LeapYear;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

    LeapYear leapYear = new LeapYear();

    @Test
    public void leapYear1996() {
        boolean leap = leapYear.isLeapYear(1996);
        assertTrue(leap);
    }

    @Test
    public void leapYears2000() {
        boolean leap = leapYear.isLeapYear(2000);
        assertTrue(leap);
    }

    @Test
    public void nonLeapYear2001() {
        boolean leap = leapYear.isLeapYear(2001);
        assertFalse(leap);
    }

    @Test
    public void nonLeapYear1900() {
        boolean leap = leapYear.isLeapYear(1900);
        assertFalse(leap);
    }
}