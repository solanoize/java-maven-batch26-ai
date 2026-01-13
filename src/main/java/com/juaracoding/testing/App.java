package com.juaracoding.testing;

import java.util.HashSet;
import java.util.List;

import com.juaracoding.testing.model.Cart;
import com.juaracoding.testing.model.Product;

public class App {
    public static void main(String[] args) {
        HashSet<Cart> carts = new HashSet<>();

        carts.addAll(List.of(
                new Cart(new Product(1, "P01", 20000, 10, 10), 2),
                new Cart(new Product(2, "P02", 5400, 0, 20), 3),
                new Cart(new Product(3, "P03", 145000, 50, 80), 1)));

        double total = 0;
        for (Cart cart : carts) {
            System.out.println("Nama Product = " + cart.getProduct().getName());
            System.out.println("Harga product = " + cart.getProduct().getPrice());
            System.out.println("Qty = " + cart.getQty());
            System.out.println("Discount = " + cart.getProduct().getDiscount());
            System.out.println("Subtotal = " + cart.getSubtotal());
            System.out.println("  ");
            total += cart.getSubtotal();
        }

        System.out.println("Total yang harus di bayar = " + total);
    }
}
