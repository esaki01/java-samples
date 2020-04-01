package StreamAPI.中間操作;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        List<List<String>> listDouble = Arrays.asList(list, list);

        // map：Function(Stream) -> Any
        list.stream().map(s -> "Hello " + s).forEach(System.out::println);
        listDouble.forEach(l -> l.stream().map(s -> "Hello " + s).forEach(System.out::println));

        // flatMap：Function(Stream) -> Stream
        listDouble.stream().flatMap(Collection::stream).forEach(s -> System.out.println("Hello " + s));

        // filter：Predicate(Stream) -> boolean
        list.stream().filter(s -> s.equals("A")).forEach(System.out::println);

        // limit - 引数：数値
        list.stream().limit(2).forEach(System.out::println);

        // distinct
        listDouble.stream().distinct().forEach(System.out::println);
    }
}
