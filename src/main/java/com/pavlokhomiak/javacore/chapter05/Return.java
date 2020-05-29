package com.pavlokhomiak.javacore.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before return");
        if (t) return;
        System.out.println("This operator not execute");
    }
}
