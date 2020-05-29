package com.pavlokhomiak.javacore.chapter07;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;

        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.4);
        System.out.println("Result of call od.test(123.4 " + result);
    }
}
