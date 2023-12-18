package collecction;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> demoSet = new HashSet<>();
        demoSet.add("A");
        demoSet.add("B");

        for (String string : demoSet) {
            System.out.println(string);
        }

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(10);
        sortedSet.add(5);
        for (Integer i : sortedSet) {
            System.out.println(i);
        }
    }
}
