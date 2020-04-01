package 基礎.Setインタフェース;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.remove(2);
        System.out.println(set.toString());

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5);
        Set<Integer> listToSet = new HashSet<>(list);

        System.out.println(listToSet.toString());
    }
}
