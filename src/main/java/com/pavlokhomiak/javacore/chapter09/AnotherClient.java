package com.pavlokhomiak.javacore.chapter09;

public class AnotherClient implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("One more variant p*p " + (param*param));
    }
}
