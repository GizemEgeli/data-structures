package com.egeli.ds.stack;

import com.egeli.ds.stack.element.LinkedStackOfString;

/**
 * Linked List represantation of stacks
 */
public class LinkedListStackApp {

    public static void main(String[] arg) {
        LinkedStackOfString stack = new LinkedStackOfString();
        stack.push("g");
        stack.push("i");
        stack.push("z");
        stack.push("e");
        stack.push("m");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()); // 'mezig' will be output
        }

    }

}
