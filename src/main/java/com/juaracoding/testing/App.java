package com.juaracoding.testing;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Person igy = new Person();
        Person gina = new Person();
        Person nanda = new Person();
        Person bella = new Person();
        Person jeremy = new Person();
        Person didi = new Person();

        /**
         * Karena kita mendefinisikan properti nama dan usia di kelas Person,
         * properti tersebut akan tersedia di semua objek kelas Person.
         * Artinya, Anda dapat menetapkan nilai ke atau membaca nilai dari field name
         * dan age pada objek kelas Person.
         */

        igy.name = "Fiergyano";
        igy.age = 17;

        gina.name = "Agina Permata";
        gina.age = 17;

        // System.out.printf("Namaku %s, aku berumur %d tahun\n", igy.name, igy.age);
        // System.out.println("Nama igy = " + igy.name);
        // System.out.println("Umur igy = " + igy.age);

        igy.sayHi();

        // System.out.printf("Namaku %s, aku berumur %d tahun\n", gina.name, gina.age);
        // System.out.println("Nama Gina = " + gina.name);
        // System.out.println("Umur Gina = " + gina.age);

        gina.sayHi();

    }
}
