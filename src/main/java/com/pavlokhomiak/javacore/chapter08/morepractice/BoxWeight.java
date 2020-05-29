package com.pavlokhomiak.javacore.chapter08.morepractice;


import com.pavlokhomiak.javacore.chapter07.Box;

public class BoxWeight extends Box {
    public double weight;

    public BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}
