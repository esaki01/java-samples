package 文字列操作;

import java.text.MessageFormat;

public class FormatSample {
    public static void main(String[] args) {
        int number = 13;
        String parameter = "apples";

        System.out.printf("I have %d %s.\n", number, parameter);
        System.out.println(MessageFormat.format("I have {0} {1}.", number, parameter));
    }
}
