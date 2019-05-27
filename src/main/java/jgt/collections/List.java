package jgt.collections;

import java.util.*;

public class List {

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("LIST -> ARRAY LIST");
        System.out.println("********************************");

        java.util.List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "aa");
        list.add(2, "bb");

        list.forEach(x -> System.out.print(x + " - "));

        System.out.println("\n********************************");
        System.out.println("********************************");
        System.out.println("********************************");

        System.out.println("********************************");
        System.out.println("VECTOR IMPL");
        System.out.println("********************************");

        Vector<String> vector = new Vector<>();

        System.out.println("vector initial capacity " + vector.capacity());
        for (int i = 0; i < 11; i++) {
            vector.add(i + "");
        }
        System.out.println("11 elements added");
        System.out.println("vector capacity " + vector.capacity());
        vector.forEach(x -> System.out.print(x + " - "));


        System.out.println("\n********************************");
        System.out.println("STACK IMPL");
        System.out.println("********************************");

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.forEach(x -> System.out.print(x + " - "));
        String peek = stack.peek();
        System.out.println("\npeek " + peek);
        stack.forEach(x -> System.out.print(x + " - "));
        String pop = stack.pop();
        System.out.println("\npop " + pop);
        stack.forEach(x -> System.out.print(x + " - "));

        System.out.println("\n********************************");
        System.out.println("LINKED LIST");
        System.out.println("********************************");

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("add 0->10");
        for (int i = 0; i < 11; i++) {
            linkedList.add(i + "");
        }

        linkedList.forEach(x -> System.out.print(x + " - "));
        System.out.println("push 11->20");
        for (int i = 11; i < 21; i++) {
            linkedList.push(i + "");
        }
        linkedList.forEach(x -> System.out.print(x + " - "));

        String peek1 = linkedList.peek();
        System.out.println("\npeek " + peek1);
        String peekLast = linkedList.peekLast();
        System.out.println("\npeek last" + peekLast);

    }
}
