package 日付処理;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPISample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println(LocalDateTime.of(2017, Month.JANUARY, 1, 1, 23, 45));

        System.out.println(LocalDateTime.parse("2017-01-01T01:23:45.678"));

        System.out.println(dateTime.getYear());
        System.out.println(dateTime.plusDays(3));

        // DateTimeFormatter はスレッドセーフ
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(dateTime));
    }
}
