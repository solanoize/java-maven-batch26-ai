package com.juaracoding.testing;

public class App {
    public static void main(String[] args) {

        String[] daftarMenuMakanan = {
                "Sashimi",
                "Mie Ayam",
                "Bakso",
                "Ice Cream Vanila",
                "Jus Mangga"
        };

        // for (int i = 0; i < daftarMenuMakanan.length; i++) {
        // System.out.println("Nilai index ke " + i + " adalah = " +
        // daftarMenuMakanan[i]);
        // }

        // for (String makanan : daftarMenuMakanan) {
        // System.out.println(makanan);
        // }

        // Menghitung total dari subtotal
        // ==============================
        int[] subtotal = {
                10_000,
                230_000,
                123_500,
                15_342,
        };

        int total = 0;

        for (int itemSubtotal : subtotal) {
            total = total + itemSubtotal;
        }

        System.out.println("Total belanja = Rp. " + total);

    }
}
