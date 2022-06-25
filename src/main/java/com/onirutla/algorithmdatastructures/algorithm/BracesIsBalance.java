package com.onirutla.algorithmdatastructures.algorithm;

import java.util.Stack;

public class BracesIsBalance {

    public static boolean isBalance(String s) {
        Stack<String> stack = new Stack<>();
        for (String brace : s.split("")) {
            if (brace.equals("{") || brace.equals("(") || brace.equals("[")) {
                stack.push(brace);
                continue;
            }
            if (!stack.isEmpty()) {
                if (stack.peek().equals("{") && brace.equals("}")) {
                    stack.pop();
                } else if (stack.peek().equals("(") && brace.equals(")")) {
                    stack.pop();
                } else if (stack.peek().equals("[") && brace.equals("]")) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
