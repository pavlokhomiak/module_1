package com.pavlokhomiak.javacore.chapter07;

public class Outer {
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        void display() {
            System.out.println("Output outer_x = " + outer_x);
        }
    }
}
