package com.pavlokhomiak.javacore.chapter07;

public class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;
        // ob.c = 100;

        ob.setC(100);
        System.out.println("a, b & c " + ob.a + " " + ob.b +
                " " + ob.getC());
    }
}
