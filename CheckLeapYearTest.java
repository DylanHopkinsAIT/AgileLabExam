import junit.framework.TestCase;

public class CheckLeapYearTest extends TestCase {

    CheckLeapYear checkLeapYear = new CheckLeapYear();

    //Test Number: 1
    //Test objective: Verify valid year lies between 1582 and 10000
    //Input(s): 200
    //Output(s): False
    public void testCheckLeapYear001() throws Exception {
        assertFalse(checkLeapYear.isLeapYear(200));
    }

    //Test Number: 2
    //Test objective: Verify is a leap year if value is divisible by 4
    //Input(s): 1980
    //Output(s): True
    public void testCheckLeapYear002() throws Exception {
        assertTrue(checkLeapYear.isLeapYear(1980));
    }

    //Test Number: 3
    //Test objective: Verify is a leap year if value is divisible by 400
    //Input(s): 2000
    //Output(s): True
    public void testCheckLeapYear003() throws Exception {
        assertTrue(checkLeapYear.isLeapYear(2000));
    }

    //Test Number: 4
    //Test objective: Verify is not a leap year if value is divisible by 100 but not by 400
    //Input(s): 1900
    //Output(s): False
    public void testCheckLeapYear004() throws Exception {
        assertFalse(checkLeapYear.isLeapYear(1900));
    }

}