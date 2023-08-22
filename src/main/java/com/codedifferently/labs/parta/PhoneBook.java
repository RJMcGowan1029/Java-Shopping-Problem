package com.codedifferently.labs.parta;

//declares the beginning of Phonebook class
public class PhoneBook {
    private PhoneBookEntry[] entries; // entries private for Phonebook array
    private int currentSize; // private variable keeping track of the number of entries listed

    public PhoneBook() {
        this.entries = new PhoneBookEntry[100];
        // entries are initialized within an array size set for 100
        this.currentSize = 0; // when a phonebook object is made, size set to 0
    }

    public void displayAll() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(i + ". " + entries[i]); // displays all the entries by iteration
        }
    }

    public void displayAtIndex(int index) {
        if (index >= 0 && index < currentSize) {
            System.out.println(entries[index]);
        } else {
            System.out.println("Invalid index."); //displays entry at index, information valid, prints entry info
        }
    }

    public boolean addEntry(String firstName, String lastName, String phoneNumber) {
        if (currentSize < entries.length) {
            entries[currentSize++] = new PhoneBookEntry(firstName, lastName, phoneNumber);
            return true;
        } else {
            return false; // creates new entry by checking for enough space to add, then adds
        }
    }

    public void removeAtIndex(int index) {
        if (index >= 0 && index < currentSize) {
            System.arraycopy(entries, index + 1, entries, index, currentSize - index - 1);
            currentSize--;
        } else {
            System.out.println("Invalid index."); // removes entry at a specified index, shifts remaining entries
        }
    }

    public PhoneBookEntry getAtIndex(int index) {
        if (index >= 0 && index < currentSize) {
            return entries[index];
        } else {
            System.out.println("Invalid index."); // checks for valid index, retrieves and returns the specific entry
            return null;
        }
    }

    public PhoneBookEntry findByName(String firstName, String lastName) {
        for (int i = 0; i < currentSize; i++) {
            if (entries[i].getFirstName().equals(firstName) && entries[i].getLastName().equals(lastName)) {
                return entries[i];
            }
        }
        return null; // iterates, compares, find and returns matching entries
    }
}

