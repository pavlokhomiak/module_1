package com.pavlokhomiak.javacore.chapter08.superkeyword;

public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Member i in superclass: " + super.i);
        System.out.println("Member i in subclass: " + i);
    }
}
