package collecction;

import java.util.LinkedList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.addFirst("Đầu");
        list.remove("B");
        for (String string : list) {
            System.out.println(string);
        }
    }
}
