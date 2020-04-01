package 日付処理;

import java.util.Calendar;

public class CalendarSample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.set(Calendar.MINUTE, 18);
        calendar.add(Calendar.YEAR, 2);

        System.out.println(calendar.getTime());
    }
}
