package com.juaracoding.testing;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<String> daftarMobil = new ArrayList<>();
        daftarMobil.add("Volvo"); // index 0
        daftarMobil.add("BMW"); // index 1
        daftarMobil.add("Toyota"); // index 2

        // System.out.println("Isi daftar mobil = " + daftarMobil);

        // daftarMobil.set(2, "Daihatsu");

        // System.out.println("Isi daftar mobil yang sudah diubah = " + daftarMobil);

        // String bmw = daftarMobil.get(1);

        // System.out.println("Isi nilai index 1 = " + bmw);

        // int banyakItem = daftarMobil.size();
        // System.out.println(banyakItem);

        /**
         * Looping array list cara 1
         */
        // for (int i = 0; i < daftarMobil.size(); i++) {
        // System.out.println(daftarMobil.get(i));
        // }

        /**
         * Looping array list cara 2
         */
        Collections.sort(daftarMobil);
        for (String mobil : daftarMobil) {
            System.out.println(mobil);
        }
    }
}
