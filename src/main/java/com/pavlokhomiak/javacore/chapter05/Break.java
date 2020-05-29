package com.pavlokhomiak.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Preceded by break.");
                    if(t) break second;
                    System.out.println("Not execute");
                }
                System.out.println("Not execute");
            }
            System.out.println("After second block");
        }
    }
}
