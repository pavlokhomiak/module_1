package com.pavlokhomiak.javacore.chapter08.morepractice;

import com.pavlokhomiak.javacore.chapter07.Box;

public class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c){
        super(w, h, d);
        color = c;
    }
}
