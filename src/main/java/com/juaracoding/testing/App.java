package com.juaracoding.testing;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> daftarWarga = new LinkedList();

        daftarWarga.add("Budi");
        daftarWarga.add("Erni");
        daftarWarga.add("Salim");
        daftarWarga.add("Deni");

        System.out.println(daftarWarga);
        System.out.println(daftarWarga.size());

        daftarWarga.addFirst("Doni");

        System.out.println(daftarWarga);
        System.out.println(daftarWarga.size());

        daftarWarga.addLast("Susi");

        System.out.println(daftarWarga);
        System.out.println(daftarWarga.size());

        daftarWarga.set(3, "Jery");

        System.out.println(daftarWarga);
        System.out.println(daftarWarga.size());

        daftarWarga.removeFirst();
        System.out.println(daftarWarga);
        System.out.println(daftarWarga.size());

        daftarWarga.removeLast();
        System.out.println(daftarWarga);
        System.out.println(daftarWarga.size());
    }
}
