package com.pavlokhomiak.javacore.chapter07;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "First string";
        String str2 = "Second string";
        String str3 = str1;

        System.out.println("Length str1 " + str1.length());
        System.out.println("Character at index 3 in str1 " + str1.charAt(3));

        if (str1.equals(str2)) System.out.println("str1 == str2");
        else System.out.println("str1 != str2");

        if (str1.equals(str3)) System.out.println("str1 == str3");
        else System.out.println("str1 != str3");
    }
}
