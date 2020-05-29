package com.pavlokhomiak.javacore.chapter08.morepractice;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(10, 20, 15, 34.5);
        BoxWeight boxWeight1 = new BoxWeight(2, 3, 4, 0.555);
        double vol;

        vol = boxWeight.volume();
        System.out.println("Volume boxWeight is " + vol);
        System.out.println("Weight boxWeight is " + boxWeight.weight);

        // the same...
    }
}
