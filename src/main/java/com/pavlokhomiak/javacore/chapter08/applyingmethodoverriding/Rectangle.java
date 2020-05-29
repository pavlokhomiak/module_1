package com.pavlokhomiak.javacore.chapter08.applyingmethodoverriding;

public class Rectangle extends Figure {
    Rectangle(double e, double t){
        super(e,t);
    }

    double area(){
        System.out.println("Area of rectangle is ");
        return dim1 * dim2;
    }
}
