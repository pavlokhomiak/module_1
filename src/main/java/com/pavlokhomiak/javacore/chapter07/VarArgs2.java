package com.pavlokhomiak.javacore.chapter07;

public class VarArgs2 {
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Content");
        for (int i : v) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One parameter of variable length ", 10);
        vaTest("Second one ", 1,2,3);
        vaTest("Without parameters");
    }
}
