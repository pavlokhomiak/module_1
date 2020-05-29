package com.pavlokhomiak.javacore.chapter08.superkeyword;

import com.pavlokhomiak.javacore.chapter07.Box;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight boxWeight) {
        super(boxWeight);
        weight = boxWeight.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
