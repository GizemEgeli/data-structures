package com.egeli.ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionDequeApp {

    public static void main(String[] arg) {
        Deque<String> stack = new ArrayDeque<>();

        stack.addFirst(" egeli");
        stack.push("g");
        stack.push("i");
        stack.push("z");
        stack.push("e");
        stack.push("m");

        System.out.println(stack.getFirst()); // 'm' will be output
        System.out.println(stack.getLast()); // ' egeli' will be output


        while (!stack.isEmpty()) {
            System.out.print(stack.pop()); // 'mezig egeli' will be output
        }

    }
}
