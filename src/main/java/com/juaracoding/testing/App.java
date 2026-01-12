package com.juaracoding.testing;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();

        data.add("gajah");
        data.add("ayam");
        data.add("Kerbau");
        data.add("kerbau");
        data.add("kerbau");
        data.add("kerbau");

        System.out.println(data);
    }
}
