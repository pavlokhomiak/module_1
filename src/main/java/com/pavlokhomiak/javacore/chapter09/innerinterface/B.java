package com.pavlokhomiak.javacore.chapter09.innerinterface;

public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
