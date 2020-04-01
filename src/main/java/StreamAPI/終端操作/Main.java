package StreamAPI.終端操作;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grapefruits");

        // 繰り返し処理を行う終端処理
        // forEach：Consumer(Stream)
        list.forEach(System.out::println);

        // 結果をまとめて取り出す終端処理
        // collect - 引数：Collectors.toList()
        List<String> listToList = list.stream().limit(2).collect(Collectors.toList());
        listToList.forEach(System.out::println);

        // collect - 日k数：Collectors.toMap()
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s, String::length));

        // collect - 引数：Collectors.joining()
        String joining = list.stream().limit(2).collect(Collectors.joining(","));
        System.out.println(joining);

        // その他：groupingBy, findFirst, findAny, min, max, count, sum, average
    }
}
