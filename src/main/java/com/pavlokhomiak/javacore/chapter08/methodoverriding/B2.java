package com.pavlokhomiak.javacore.chapter08.methodoverriding;

public class B2 extends A {
    int k;
    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String s) {
        System.out.println(s + k);
    }
}
