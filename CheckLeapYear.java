public class CheckLeapYear {

    public boolean isLeapYear(int year) throws Exception {

        if (year >= 1582 && year <= 10000) {

            if (year % 4 == 0) {
                return true;
            }

            if (year % 400 == 0) {
                return true;
            }

            if (year % 100 == 0 && year % 400 != 0 ){
                return false;
            }

            else
                return false;
        }

        throw new RuntimeException("Minimum year is 1582");
    }

}

