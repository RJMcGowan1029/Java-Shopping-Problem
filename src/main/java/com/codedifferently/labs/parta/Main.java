package com.codedifferently.labs.parta; //This line declares the package name where the main class resides

import java.util.Scanner; //This line imports the 'scanner' class from the 'java.utl' package, which is used to read input from

public class Main { //starts declaration of main class
    public static void main(String[] args) { //this line starts the main method
        PhoneBook phoneBook = new PhoneBook(); //instance of phonebook is created this is where entries will be stored
        Scanner scanner = new Scanner(System.in); //reads input from standard input
        boolean keepRunning = true; //boolean variable declared to control the loop

        while (keepRunning) {
            System.out.println("Menu:"); //display the menu options
            System.out.println("1. Display all entries"); // option one
            System.out.println("2. Display entry at specific index"); // option two
            System.out.println("3. Add entry"); // option three
            System.out.println("4. Remove entry at specific index"); // option four
            System.out.println("5. Get entry at specific index"); // option five
            System.out.println("6. Find entry by name");// option six
            System.out.println("7. Exit");// option seven
            System.out.print("Enter your choice: ");// displays enter your choice

            int choice = scanner.nextInt(); //Read the integer value representing the user's choice.
            scanner.nextLine(); // Clear the newline

            switch (choice) { //starts a switch statement
                case 1: //displays all entries in the phonebook
                    phoneBook.displayAll(); //displays all entries in the phonebook
                    break; //terminates the execution of the current loop
                case 2:
                    System.out.print("Enter index: "); //prints string
                    int index = scanner.nextInt(); //scanner object
                    phoneBook.displayAtIndex(index); //Asks the user for an index and displays the entry at that index.
                    break; //terminates the execution of the current loop
                case 3:
                    System.out.print("Enter first name: "); //prints string
                    String firstName = scanner.nextLine();//scanner object
                    System.out.print("Enter last name: "); //prints string
                    String lastName = scanner.nextLine();//scanner object
                    System.out.print("Enter phone number: ");//prints string
                    String phoneNumber = scanner.nextLine();//scanner object
                    if (phoneBook.addEntry(firstName, lastName, phoneNumber)) { //if statement
                        System.out.println("Entry added successfully.");//prints string
                    } else {//else statement
                        System.out.println("Failed to add entry. Phonebook might be full.");//prints string
                    }
                    break; //terminates the execution of the current loop
                //Collects first name, last name, and phone number from the user,
                //adds an entry to the phone book, and provides a success message or an error message
                //if the phone book is full.
                case 4:
                    System.out.print("Enter index: ");//prints string
                    int idxToRemove = scanner.nextInt();//scanner object
                    phoneBook.removeAtIndex(idxToRemove);
                    break; //terminates the execution of the current loop
                //Asks the user for an index and removes the entry at that index
                case 5:
                    System.out.print("Enter index: ");//prints string
                    int idxToGet = scanner.nextInt();//scanner object
                    PhoneBookEntry entry = phoneBook.getAtIndex(idxToGet);
                    if (entry != null) { //if statement
                        System.out.println(entry);
                    }
                    break; //terminates the execution of the current loop
                //Asks the user for an index and retrieves the entry at that index, then displays it.
                case 6:
                    System.out.print("Enter first name: ");//prints string
                    String fName = scanner.nextLine();//scanner object
                    System.out.print("Enter last name: ");//prints string
                    String lName = scanner.nextLine();//scanner object
                    PhoneBookEntry foundEntry = phoneBook.findByName(fName, lName);
                    if (foundEntry != null) { //if statement
                        System.out.println(foundEntry);
                    } else { //else statement
                        System.out.println("Entry not found.");//prints string
                    }
                    break; //terminates the execution of the current loop
                //Asks the user for first and last names, searches for an entry by name in the phone book
                //and displays the found entry or an "Entry not found" message.
                case 7:
                    keepRunning = false;
                    break; //terminates the execution of the current loop
                //Sets keepRunning to false, ending the loop and exiting the program.
                default:
                    System.out.println("Invalid choice.");//prints string
                    break; //terminates the execution of the current loop
                //Handles an invalid choice by displaying an error message.
            }
        }

        scanner.close(); //closes the scanner
    }
}