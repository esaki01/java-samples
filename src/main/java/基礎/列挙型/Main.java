package 基礎.列挙型;

public class Main {
    public static void main(String[] args) {
        for(HttpStatus httpStatus : HttpStatus.values()) {
            System.out.println(httpStatus);
        }

        System.out.println(HttpStatus.valueOf("OK"));
    }
}
