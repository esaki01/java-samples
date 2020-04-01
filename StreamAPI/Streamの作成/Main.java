package Streamの作成;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // リストから作成
        List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");
        Stream<String> streamList = list.stream();
        streamList.forEach(System.out::println);

        // 配列から作成
        String[] array = {"Murata", "Okada", "Tanimoto"};
        Stream<String> streamArray = Arrays.stream(array);
        streamArray.forEach(System.out::println);

        // ofメソッド
        Stream<String> streamOf = Stream.of("Murata", "Okada", "Tanimoto");
        streamOf.forEach(System.out::println);

        // Mapから作成
        Map<String, String> map = new HashMap<>();
        map.put("1", "Murata");
        map.put("2", "Okada");
        map.put("3", "Tanimoto");

        Stream<Map.Entry<String, String>> streamMap = map.entrySet().stream();
        streamMap.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        Stream<String> streamValues = map.values().stream();
        streamValues.forEach(System.out::println);

        // 数値範囲から作成
        IntStream streamInt = IntStream.range(1, 5);
        streamInt.forEach(System.out::println);

        IntStream streamIntContainsLast = IntStream.rangeClosed(1, 5);
        streamIntContainsLast.forEach(System.out::println);

        // StreamからListの作成
        List<Integer> integerList = IntStream.of(1, 62, 31, 1, 54, 31).boxed().collect(Collectors.toList());
        List<Integer> integerList2 = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        List<String> stringList = Stream.of("A", "B", "C").collect(Collectors.toList());
    }
}
