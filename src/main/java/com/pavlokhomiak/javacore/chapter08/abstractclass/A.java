package com.pavlokhomiak.javacore.chapter08.abstractclass;

abstract class A {
    abstract void callMe();

    void callMeToo() {
        System.out.println("Method with body");
    }
}
