package com.pavlokhomiak.javacore.chapter08.applyingmethodoverriding;

public class Triangle extends Figure {
    Triangle(double x, double y){
        super(x, y);
    }

     double area(){
         System.out.println("Triangle area is");
         return (dim1 * dim2) / 2;
     }
}
