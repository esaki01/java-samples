package イテレーター;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
