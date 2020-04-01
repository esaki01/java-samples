package 日付処理;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Date date = new Date(5000); // 1970/01/01 0時 (GMT) から5000ms経過した時刻
        System.out.println(date);

        // SimpleDateFormat はスレッドセーフでない
        DateFormat df = new SimpleDateFormat("yyy/MM/dd");
        System.out.println(df.format(date));
    }
}
