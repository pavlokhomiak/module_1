package com.pavlokhomiak.javacore.chapter09.defaultIF;

public interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Method clear() not realize");
    }
}
