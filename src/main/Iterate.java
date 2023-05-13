package main;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            if (n == 2) {
                iterator.remove();
            }

        }
        System.out.println(list);
    }
}
