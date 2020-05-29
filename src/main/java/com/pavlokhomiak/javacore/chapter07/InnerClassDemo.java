package com.pavlokhomiak.javacore.chapter07;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();

        Outer2 outer2 = new Outer2();
        outer.test();
    }
}
