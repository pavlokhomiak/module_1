package com.pavlokhomiak.javacore.chapter09.defaultIF;

public class MyIFImp2 implements MyIF {
    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "New string";
    }
}
