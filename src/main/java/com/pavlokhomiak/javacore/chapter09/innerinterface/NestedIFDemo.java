package com.pavlokhomiak.javacore.chapter09.innerinterface;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Number " + 10 + " is non negative");
        if (nif.isNotNegative(-12))
            System.out.println("This will not shown");
    }
}
