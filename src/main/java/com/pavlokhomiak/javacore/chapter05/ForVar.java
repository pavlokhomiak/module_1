package com.pavlokhomiak.javacore.chapter05;

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done; ) {
            System.out.println("i equal " + i);
            if (i==10) done = true;
            i++;
        }
    }
}
