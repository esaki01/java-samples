/*
要素自身が前後の要素の情報を持つことでリストを構成している java.util.LinkedList クラスもある.
 */
package リスト;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.set(1, 2);
        list.remove(1);

        System.out.println(list);

        List<Integer> list2 = Arrays.asList(1, 62, 31, 54, 31); // 読み取り専用のList
        // list2.add(1); エラー

        Collections.sort(list2);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 62, 31, 1, 54, 31));
        list3.add(3);

        System.out.println(list3.get(0));
        System.out.println(list3.indexOf(54));

        // その他便利な関数
        list3.removeIf(i -> i == 62); // true を返す要素を全て削除
        list3.replaceAll(i -> i + 1); // 全要素を置き換え
        System.out.println(list3);
    }
}
