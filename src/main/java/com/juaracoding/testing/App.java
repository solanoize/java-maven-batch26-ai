package com.juaracoding.testing;

import java.util.Arrays;

public class App {
    public static void main(String... args) {

        System.out.println("contoh args ke 0 " + args[0]);

        // syarat discount >= x
        Object[][] discounts = {
                { "Product 01", 10000, 2 },
                { "Product 03", 5000, 3 },
        };

        Object[][] carts = {
                { "Product 01", 20000, 2, 0 }, // 20000 * 2 = 40000 - 10000 = 30000
                { "Product 02", 15000, 5, 0 }, // 15000 * 5 = 75000
                { "Product 03", 25000, 1, 0 }, // 25000 * 1 = 25000
        };

        int total = 0;

        for (int baris = 0; baris < carts.length; baris++) {
            int discountPrice = 0;
            // check discount/potongan harga
            for (Object[] discount : discounts) {
                String productName = (String) carts[baris][0];
                if (productName.equals(discount[0])) {
                    // discountPrice = discount[????]
                }
            }

            int price = (int) carts[baris][1];
            int qty = (int) carts[baris][2];

            int subtotal = price * qty;

            carts[baris][3] = subtotal;
            total = total + subtotal;
        }

        System.out.println("Total belanja sebelum potongan = " + total);

        total = total - Integer.parseInt(args[0]);

        System.out.println("Rincian belanja: " + Arrays.deepToString(carts));
        System.out.println("Total belanja sesudah potongan = " + total);
    }
}
