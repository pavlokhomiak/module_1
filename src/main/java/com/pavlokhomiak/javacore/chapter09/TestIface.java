package com.pavlokhomiak.javacore.chapter09;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
