package 可変長引数;

public class Log {
    public static void log(String message, String... args) {
        System.out.println(message);
        System.out.println("パラメータ：");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
