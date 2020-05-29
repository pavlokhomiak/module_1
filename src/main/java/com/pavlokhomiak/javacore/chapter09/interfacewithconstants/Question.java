package com.pavlokhomiak.javacore.chapter09.interfacewithconstants;

import java.util.Random;

public class Question implements SharedConstants {
    Random rnd = new Random();
    int ask() {
        int prob = (int) (100 * rnd.nextDouble());
        if (prob < 30)
            return NO;
        else if (prob < 60)
            return YES;
        else if (prob < 75)
            return LATER;
        else if (prob < 98)
            return SOON;
        else
            return NEVER;
    }
}