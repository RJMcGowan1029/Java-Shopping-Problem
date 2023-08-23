package com.codedifferently.labs.partb;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //this line starts the main method
        ShoppingCart cart = new ShoppingCart(); //instance of phonebook is created this is where entries will be stored
        Scanner scanner = new Scanner(System.in); //reads input from standard input
        boolean keepRunning = true; //boolean variable declared to control the loop

        while (keepRunning) {
            System.out.println("Menu:"); //display the menu options
            System.out.println("1. Display cart"); // option one
            System.out.println("2. Add item"); // option two
            System.out.println("3. Remove item"); // option three

            int choice = scanner.nextInt(); //Read the integer value representing the user's choice.
            scanner.nextLine(); // Clear the newline

            switch (choice) { //starts a switch statement
                case 1: //displays all entries in the phonebook
                    cart.displayCart(); //displays all entries in the phonebook
                    break; //terminates the execution of the current loop
                case 2:
                    System.out.print("Enter item name: "); //prints string
                    String name = scanner.nextLine();//scanner object
                    System.out.print("Enter item price: "); //prints string
                    Double price = Double.parseDouble(scanner.nextLine());//scanner object
                    System.out.print("Enter item ID: ");//prints string
                    int productID = Integer.parseInt(scanner.nextLine());//scanner object
                    if (cart.addItem(name, price, productID)) { //if statement
                        System.out.println("Entry added successfully.");//prints string
                    } else {//else statement
                        System.out.println("Failed to add entry. Phonebook might be full.");//prints string
                    }
                    break;

                    case 3:
                        Double total = cart.calculateTotal();
                        System.out.println("Your total is: " + total);


                    break; //terminates the execution of the current loop
                //Collects first name, last name, and phone number from the user,
                //adds an entry to the phone book, and provides a success message or an error message
                //if the phone book is full.
            }
        }
        scanner.close(); //closes the scanner
    }
}
