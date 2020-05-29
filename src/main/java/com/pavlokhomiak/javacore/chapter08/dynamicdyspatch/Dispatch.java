package com.pavlokhomiak.javacore.chapter08.dynamicdyspatch;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;
        r = a;
        r.callMe();
        r = b;
        b.callMe();
        r = c;
        c.callMe();
    }
}
