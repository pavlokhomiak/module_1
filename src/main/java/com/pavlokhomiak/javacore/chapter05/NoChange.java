package com.pavlokhomiak.javacore.chapter05;

public class NoChange {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : num) {
            System.out.println(x + " ");
            x = x * 10;
        }
        System.out.println();

        for (int x : num)
            System.out.println(x + " ");
        System.out.println();
    }
}
