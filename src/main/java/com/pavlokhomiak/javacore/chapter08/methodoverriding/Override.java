package com.pavlokhomiak.javacore.chapter08.methodoverriding;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        B2 subOb2 = new B2(3, 7,8);

        subOb.show();
        subOb2.show();
        subOb2.show("msg ");
    }
}
