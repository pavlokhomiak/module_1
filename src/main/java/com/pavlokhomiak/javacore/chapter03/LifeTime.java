package com.pavlokhomiak.javacore.chapter03;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y equal: " + y);

            y = 100;
            System.out.println("y now equal: " + y);
        }
    }
}
