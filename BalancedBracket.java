package com.example.demo;

import java.util.Stack;

public class BalancedBracket {

    public static String checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char character : input.toCharArray()) {
            if (character == '{' || character == '[' || character == '(') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char topBracket = stack.pop();
                if ((character == '}' && topBracket != '{')
                        || (character == ']' && topBracket != '[')
                        || (character == ')' && topBracket != '(')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {

        System.out.println("Sampel 1: " + checkBrackets("{[()]}"));
        System.out.println("Sampel 2: " + checkBrackets("{[()]"));
        System.out.println("Sampel 3: " + checkBrackets("{(([])[])[]}"));
    }
}
