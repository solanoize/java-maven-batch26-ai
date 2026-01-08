package com.juaracoding.testing;

public class App {
    public static void main(String[] args) {
        // Pembuatan array cara pertama.
        // Array dibuat dengan kapasitas 8 item
        int[] daftarAngka = new int[8];
        // nilai dikasih belakangan
        daftarAngka[0] = 100;
        daftarAngka[1] = 30;
        daftarAngka[2] = 60;

        // System.out.println("Dafftar angka ke 1 = " + daftarAngka[1]);
        // Bagaimana jika array index ke 4 dicetak/diambil nilainya
        // padahal belum kita berikan nilai ke dalamnya.
        // Ternyata hasilnya adalah bernilai 0 secara default.
        // System.out.println("Dafftar angka ke 4 = " + daftarAngka[4]);

        // Pembuatan array cara ke dua
        // Array dibuat dan langsung di kasih nilai
        String[] daftarMenuMakanan = {
                "Sashimi", // 0
                "Mie Ayam", // 1
                "Bakso", // 2
                "Ice Cream Vanila", // 3
                "Jus Mangga" // 4
        };

        // System.out.println("Saya sedang makan " + daftarMenuMakanan[2]);
        // System.out.println("Minumnya adalah " + daftarMenuMakanan[4]);

        for (int i = 0; i < 5; i++) {
            System.out.println("Nilai index ke " + i + " adalah = " + daftarMenuMakanan[i]);
        }
    }
}
