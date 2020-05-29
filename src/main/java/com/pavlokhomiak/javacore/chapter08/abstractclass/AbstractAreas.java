package com.pavlokhomiak.javacore.chapter08.abstractclass;
public class AbstractAreas {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        Triangle triangle = new Triangle(3,5);
        Figure figure;

        figure = rectangle;
        System.out.println("Area of rectangle " + figure.area());

        figure = triangle;
        System.out.println("Area of triangle " + figure.area());
    }
}
