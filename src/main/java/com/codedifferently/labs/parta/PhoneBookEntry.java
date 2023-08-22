package com.codedifferently.labs.parta;

public class PhoneBookEntry {
    private String firstName; // Declaring a variable to be used later for the user's first name
    private String lastName; // Declaring a variable to be used later for the user's last name
    private String phoneNumber; // Declaring a variable to be used later for the user's phone number

    public PhoneBookEntry(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName; // Setting firstName to firstName inside of this method
        this.lastName = lastName; // Setting lastName to lastName inside of this method
        this.phoneNumber = phoneNumber; // Setting phoneNumber to phoneNumber inside of this method
    }

    public String getFirstName() {
        return firstName;
    } // Getting the users first name and returning it

    public String getLastName() {
        return lastName;
    } // Getting the users last name and returning it

    public String getPhoneNumber() {
        return phoneNumber;
    } // Getting the users phone number and returning it

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + phoneNumber; // Making a string that holds the user's first name, last name, and phone number.
    }
}
