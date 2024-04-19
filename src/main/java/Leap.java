import java.io.IOException;

class Leap {

    boolean isLeapYear(int year)  {
        return year%100!=0 && year%4==0 || year%400==0;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
