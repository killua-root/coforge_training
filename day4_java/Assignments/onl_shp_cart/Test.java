package com.coforge.day4.assignment.onl_shp_cart;

public class Test {

    public static void main(String[] args) {

        Customer patrick = new Customer("Patrick");
        patrick.cart.addProduct(new Product(1, "Laptop", 65000));
        patrick.cart.addProduct(new Product(2, "Wireless Mouse", 1200));

        Customer jane = new Customer("Jane");
        jane.cart.addProduct(new Product(3, "Mechanical Keyboard", 4500));
        jane.cart.addProduct(new Product(4, "Monitor", 18000));

        patrick.cart.calculateTotal();
        jane.cart.calculateTotal();
    }
}