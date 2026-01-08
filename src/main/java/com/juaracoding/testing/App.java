package com.juaracoding.testing;

public class App {
    public static void main(String[] args) {
        // Array 2 dimensi
        // di awal kita belajar array 1 dimensi
        // dimana item di dalamnya itu nilainya single,
        // nah, kalo di dalam array 2 dimensi, nilai array
        // tersebut itu juga array

        int[][] myArray = {
                // 0 1
                { 1, 2 }, // 0
                { 3, 4 }, // 1
                { 5, 6 }, // 2
                { 7, 8 } // 3
        };

        // System.out.println(myArray[0][1]);
        // System.out.println(myArray[2][0]);

        // looping array 2 dimensi cara 1
        for (int baris = 0; baris < myArray.length; baris++) {
            for (int kolom = 0; kolom < myArray[baris].length; kolom++) {
                System.out.println(myArray[baris][kolom]);
            }
        }

        // Looping array 2 dimensi cara 2
        for (int[] arrayBaris : myArray) {
            for (int nilai : arrayBaris) {
                System.out.println(nilai);
            }
        }
    }
}
