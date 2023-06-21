package com.egeli.ds.stack;

import java.util.Stack;

public class CollectionStackApp {

    public static void main(String[] arg) {
        Stack<String> stack = new Stack<>();
        stack.push("g");
        stack.push("i");
        stack.push("z");
        stack.push("e");
        stack.push("m");

        System.out.println(stack.peek()); // 'm' will be output

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()); // 'mezig' will be output
        }

    }
}
