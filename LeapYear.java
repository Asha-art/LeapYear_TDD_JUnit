package LeapYear;

public class LeapYear {

    public boolean IsLeapYear(int year) {
        boolean result = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        return result;
    }

}
