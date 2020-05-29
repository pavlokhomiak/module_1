package com.pavlokhomiak.javacore.chapter08.abstractclass;

public class Triangle extends Figure{
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println();
        return dim1 * dim2 / 2;
    }
}
