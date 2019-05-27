package jgt.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {

        System.out.println("********************************");
        System.out.println("TREE SET");
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(12);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(15);
        treeSet.add(2);

        System.out.println(treeSet.toString());

        System.out.println("********************************");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(6);
        hashSet.add(6);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(9);
        hashSet.add(1);
        System.out.println("HASH SET");
        System.out.println(hashSet.toString());
    }
}

