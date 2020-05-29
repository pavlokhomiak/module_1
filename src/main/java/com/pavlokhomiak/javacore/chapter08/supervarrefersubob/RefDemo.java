package com.pavlokhomiak.javacore.chapter08.supervarrefersubob;

import com.pavlokhomiak.javacore.chapter07.Box;
import com.pavlokhomiak.javacore.chapter08.morepractice.BoxWeight;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 4, 5, 6.7);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Weight of weightBox is " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("Volume of plainBox is " + vol);
        //System.out.println("Weight of plainBox is " + plainBox.weight);
    }
}
