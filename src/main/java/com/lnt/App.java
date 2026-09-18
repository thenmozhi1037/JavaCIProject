package com.lnt;

public class App {

    public static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        double total = calculateTotal(100.0, 3);
        System.out.println("Total Amount: " + total);
    }
}