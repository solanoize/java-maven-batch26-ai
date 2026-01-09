package com.juaracoding.testing.model;

public class Cart {
  private Product product;
  private int qty;

  public Cart(Product product, int qty) {
    this.product = product;
    this.qty = qty;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double getSubtotal() {
    double subtotal = qty * product.getPrice();

    if (product.getDiscount() > 0) {
      double subtotal_after_discount = subtotal - (subtotal * (product.getDiscount() / 100));
      return subtotal_after_discount;
    }

    return subtotal;

  }

}
