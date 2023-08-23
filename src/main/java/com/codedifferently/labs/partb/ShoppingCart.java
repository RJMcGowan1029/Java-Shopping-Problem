package com.codedifferently.labs.partb;


public class ShoppingCart {
    private Product[] entries; // entries private for Product array
    private int currentSize; // private variable keeping track of the number of entries listed

    public ShoppingCart() {
        this.entries = new Product[10];
        // entries are initialized within an array size set for 10
        this.currentSize = 0; // when a product object is made, size set to 0
    }

    public void displayCart() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(i + ". " + entries[i]); // displays all the entries by iteration
        }
    }


    public boolean addItem(String name, Double price, int productID) {
        if (currentSize < entries.length) {
            entries[currentSize++] = new Product(name, price, productID);
            return true;
        } else {
            return false; // creates new entry by checking for enough space to add, then adds
        }
    }

    public void removeItem(int index) {
        if (index >= 0 && index < currentSize) {
            System.arraycopy(entries, index + 1, entries, index, currentSize - index - 1);
            currentSize--;
        } else {
            System.out.println("Invalid index."); // removes entry at a specified index, shifts remaining entries
        }
    }

    public Product getAtIndex(int index) {
        if (index >= 0 && index < currentSize) {
            return entries[index];
        } else {
            System.out.println("Invalid index."); // checks for valid index, retrieves and returns the specific entry
            return null;
        }
    }

    public Double calculateTotal(){
        Double total = 0.0;
        for(int i = 0; i < entries.length; i++){
            Product entry = entries[i];

            total += entry.getPrice();
        }
        return total;
    }

}
