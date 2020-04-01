package 文字列操作;

public class ConcatSample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("A").append("B").append("C");
        System.out.println(builder.toString());

        String str = "AB".concat("C");
        System.out.println(str);
    }
}
