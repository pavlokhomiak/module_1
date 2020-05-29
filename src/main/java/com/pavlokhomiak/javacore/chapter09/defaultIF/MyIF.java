package com.pavlokhomiak.javacore.chapter09.defaultIF;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Object of type String";
    }
}
