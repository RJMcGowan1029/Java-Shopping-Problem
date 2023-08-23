package com.codedifferently.labs.partb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp(){ shoppingCart = new ShoppingCart();}

    @Test
    public void testAddItem(){
        assertTrue(shoppingCart.addItem("oranges", 5.00, 1));
        assertEquals(1, shoppingCart.getAtIndex(0).getProductID());
    }

    @Test
    public void testRemoveItem(){
        shoppingCart.addItem("oranges", 5.00, 1);
        shoppingCart.removeItem(0);
        assertNull(shoppingCart.getAtIndex(0));
    }


    @Test
    public void testGetAtIndex() {
        shoppingCart.addItem("oranges", 5.00, 1);
        Product entry = shoppingCart.getAtIndex(0);
        assertNotNull(entry);
        assertEquals("oranges", entry.getName());
        assertEquals(1, entry.getProductID());
    }

    @Test
    public void testCalculateTotal(){
        shoppingCart.addItem("oranges", 5.00, 1 );
        shoppingCart.addItem("apples", 2.00, 2 );
        Product entry1 = shoppingCart.getAtIndex(0);
        Product entry2 = shoppingCart.getAtIndex(1);
        double price1 = entry1.getPrice();
        double price2 = entry2.getPrice();

        double total = price1 + price2;


        assertNotNull(entry1);

        assertEquals(7.00, total);

    }
}


