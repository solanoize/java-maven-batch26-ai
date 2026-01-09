package com.juaracoding.testing;

import java.util.Arrays;

import com.juaracoding.testing.model.Cart;
import com.juaracoding.testing.model.Product;

public class App {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Mie Ayam", 15000.00, 0.0, 10),
                new Product(2, "Es Teh Tawar", 3000.00, 0.0, 100),
                new Product(3, "Kerupuk Kulit", 5000.00, 0.0, 100),
        };

        Cart[] carts = {
                new Cart(products[0], 2),
                new Cart(products[1], 3)
        };

        double total = 0;
        System.out.println("======= STRUK MAKAN RESTO UHUY =======");
        for (Cart cart : carts) {
            System.out.printf("%s (%d)\t\t %.2f\n", cart.getProduct().getName(), cart.getQty(), cart.getSubtotal());
            total = total + cart.getSubtotal();
        }

        System.out.printf("Total:\t\t Rp. %.2f\n", total);
    }
}
