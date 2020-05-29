package com.pavlokhomiak.javacore.chapter09;

public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Method with value " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Class which implement interface" +
                "can implement own method");
    }
}
