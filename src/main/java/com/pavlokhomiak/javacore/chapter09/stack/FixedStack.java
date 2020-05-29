package com.pavlokhomiak.javacore.chapter09.stack;

public class FixedStack implements IntStack {
    int[] stck;
    int tos;

    FixedStack(int n) {
        stck = new int[n];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
