package com.pavlokhomiak.javacore.chapter07;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        Box myClone = new Box(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume myBox1 equal " + vol);
        vol = myBox2.volume();
        System.out.println("Volume myBox2 equal " + vol);
        vol = myCube.volume();
        System.out.println("Volume myCube equal " + vol);
        vol = myClone.volume();
        System.out.println("Volume of clone equal " + vol);
    }
}
