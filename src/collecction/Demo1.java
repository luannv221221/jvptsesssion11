package collecction;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
//        list.remove("B");
//        list.remove("A");
//        list.remove("C");
        List<String> deleted = new ArrayList<>();
        deleted.add("A");
        deleted.add("B");
        deleted.add("C");
//        list.removeAll(deleted);
//        System.out.println(list.isEmpty());
        System.out.println(list.contains("C"));
        System.out.println(list.size());
        for (String string : list) {
            System.out.println(string);
        }

    }
}
