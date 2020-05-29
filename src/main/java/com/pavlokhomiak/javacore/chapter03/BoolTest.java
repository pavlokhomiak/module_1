package com.pavlokhomiak.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equal " + b);
        b = true;
        System.out.println("b equal " + b);

        if(b) System.out.println("Code will execute");
        b = false;
        if(b) System.out.println("Code will not execute");

        System.out.println("10 > 9 equal " + (10 > 9));
    }
}
