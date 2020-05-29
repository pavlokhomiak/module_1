package com.pavlokhomiak.javacore.chapter07;

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 stack2 = new Stack2(5);
        Stack2 stack22 = new Stack2(8);

        for (int i = 0; i < 5; i++) {
            stack2.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack22.push(i);
        }

        System.out.println("Stack in stack2");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack2.pop());
        }
        System.out.println("Stack in stack22");
        for (int i = 0; i < 8; i++) {
            System.out.println(stack22.pop());
        }
    }
}
