package com.juaracoding.testing;

import java.util.Arrays;

import com.juaracoding.testing.model.Product;

public class App {
    public static void main(String[] args) {
        Person igy = new Person();
        igy.setName("Igy");
        igy.setAge(17);

        String name = igy.getName();
        int age = igy.getAge();

        System.out.println(name);
        System.out.println(age);

        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Sayur Bayam");
        p1.setDiscount(20.0);
        p1.setPrice(30000.00);
        p1.setStock(2);

        System.out.println("ID = " + p1.getId());
        System.out.println("Name = " + p1.getName());

        if (p1.isStockAvailable()) {
            System.out.println("Stock masih aman");
        } else {
            System.out.println("Stock sudah dibawah minimum stock");
        }
    }
}
