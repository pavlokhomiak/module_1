package com.pavlokhomiak.javacore.chapter05;

public class ForEach {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int x : num) {
            System.out.println("Value equal: " + x);
            sum += x;
        }
        System.out.println("Sum is equal " + sum);
    }
}
