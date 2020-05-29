package com.pavlokhomiak.javacore.chapter02;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x less to y");

        x = x * 2;
        if(x == y) System.out.println("x equal y");

        x = x * 2;
        if(x > y) System.out.println("x larger y");

        if(x == y) System.out.println("You shouldn't see this");
    }
}
