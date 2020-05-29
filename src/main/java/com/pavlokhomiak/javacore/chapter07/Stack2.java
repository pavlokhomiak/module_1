package com.pavlokhomiak.javacore.chapter07;

public class Stack2 {
    private int[] stck;
    private int tos;

    Stack2(int length) {
        stck = new int[length];
        tos = -1;
    }

    void push(int n) {
        if (tos == stck.length-1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = n;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
