package com.pavlokhomiak.javacore.chapter07;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equal(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
