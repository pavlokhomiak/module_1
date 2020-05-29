package com.pavlokhomiak.javacore.chapter05;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    System.out.println("i lower 3");
                    break;
                case 3:
                case 4:
                    System.out.println("i lower 5");
                    break;
                default:
                    System.out.println("i is 5");
            }
        }
    }
}
