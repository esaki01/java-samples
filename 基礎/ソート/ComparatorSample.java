/*
Comparatorによるソート -> 業務的に必要な並び方によるソートとして利用する.
 */
package ソート;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSample {
    public static void main(String[] args) {
        Integer[] array = {3, 1, 13, 2, 8, 5, 1};
        // Arrays.sort(array);
        // MEMO: 匿名クラス？
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        Arrays.sort(array, c);
        System.out.println(Arrays.toString(array));
    }
}
