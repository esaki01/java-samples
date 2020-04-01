package 基礎.文字列操作;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {
    public static void main(String[] args) {
        // 適合するかチェック
        Pattern pattern = Pattern.compile("This is a .*\\.");
        String sentence = "This is a pen.";

        Matcher matcher = pattern.matcher(sentence);
        if (matcher.matches()) {
            System.out.println("適合する");
        } else {
            System.out.println("適合しない");
        }

        // 文字列を分割する
        Pattern pattern2 = Pattern.compile("\\s+");
        String sentence2 = "This    is a  pen.";

        String[] words = pattern2.split(sentence2);
        for (String word : words) {
            System.out.println(word);
        }

        // 文字列を置換する
        Matcher matcher2 = pattern2.matcher(sentence2);
        System.out.println(matcher2.replaceAll(","));

        // Stringクラスのメソッドで正規表現を使う
        System.out.println(sentence.matches("This is a .*\\."));
        System.out.println(Arrays.toString(sentence2.split("\\s+")));
        System.out.println(sentence2.replaceAll("\\s+", ","));
    }
}
