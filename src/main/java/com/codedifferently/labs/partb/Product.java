package com.codedifferently.labs.partb;

public class Product {
    private String name; // Declaring a variable to be used later for the item name
    private double price; // Declaring a variable to be used later for item price name
    private int productID; // Declaring a variable to be used later for item product ID number

    public Product(String name, double price, int productID) {
        this.name = name; // Setting name to name inside of this method
        this.price = price; // Setting price to price inside of this method
        this.productID = productID; // Setting productID to productID inside of this method
    }

    public String getName() {
        return name;
    } // Getting the item name and returning it

    public double getPrice() {
        return price;
    } // Getting the item price and returning it

    public int getProductID() {
        return productID;
    } // Getting the item productID and returning it

    @Override
    public String toString() {
        return name + " " + price + ": " + productID; // Making a string that holds the items' name, price, and productID.
    }
}
