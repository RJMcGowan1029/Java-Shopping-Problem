package com.codedifferently.labs.partb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testGet(){
        String name = "oranges";
        double price = 5.00;
        int productID = 1;

        Product entry = new Product(name, price, productID);

        assertEquals(name, entry.getName(), "Item name should match the provided value.");
        assertEquals(price, entry.getPrice(), "Item price should match the provided value.");
        assertEquals(productID, entry.getProductID(), "Item's Product ID should match the provided value.");

    }

    @Test
    public void testToString(){
        Product entry = new Product("oranges", 5.01, 1);
        String expected = "oranges 5.01: 1";
        assertEquals(expected, entry.toString(), "toString() should return the formatted string.");
    }
}
