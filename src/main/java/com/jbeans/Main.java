package com.jbeans;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("########################################################################");
        //String Filter only Alpha numeric
        String rawdata="34948i&^@*7a7YE7T63T232U3Y9I23J2KNK2JWN@*9482knkmqneYQ@(";
        String alphnum= rawdata.replaceAll("[^ a-zA-Z0-9]","");
        System.out.println("\n Alpha Numeric :: "+ alphnum);
        System.out.println("########################################################################");
        //String Reverse
        String reversmsg="Hello and welcome!";
        StringBuilder sb=new StringBuilder(reversmsg);
        Stream.of(sb.reverse()).forEach(System.out::println);
    }
}