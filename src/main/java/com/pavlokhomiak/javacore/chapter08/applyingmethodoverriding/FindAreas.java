package com.pavlokhomiak.javacore.chapter08.applyingmethodoverriding;

public class FindAreas {
    public static void main(String[] args) {
        Figure f1 = new Figure(1, 5);
        Figure f2 = new Rectangle(2,4);
        Figure f3 = new Triangle(4,5);
        Triangle f4 = new Triangle(3,4);

        Figure fig;

        fig = f1;
        System.out.println(fig.area());
        System.out.println(f2.area());
        f3.area();
        f4.area();

    }
}
