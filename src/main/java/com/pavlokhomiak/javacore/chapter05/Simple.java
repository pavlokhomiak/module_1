package com.pavlokhomiak.javacore.chapter05;

public class Simple {
    public static void main(String[] args) {
        int a, b;
        b = 4;

        for (a=1; a<b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}
