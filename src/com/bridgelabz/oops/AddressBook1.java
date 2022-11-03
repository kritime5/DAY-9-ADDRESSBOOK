package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook1 {
    Scanner s = new Scanner(System.in);
    List<Contacts> contactsArrayList = new ArrayList<Contacts>();

    //ADD NEW CONTACT TO ADDRESS BOOK-USE CONSOLE TO ADD PERSON DETAILS
    public void addContact() {
        Contacts contacts = new Contacts();
        System.out.println("Enter first name");
        String firstName = s.next();
        contacts.setFirstName(firstName);
        System.out.println("Enter last name");
        String lastName = s.next();
        contacts.setLastName(lastName);
        System.out.println("Enter address");
        String address = s.next();
        contacts.setAddress(address);
        System.out.println("Enter city name");
        String city = s.next();
        contacts.setCity(city);
        System.out.println("Enter state name");
        String state = s.next();
        contacts.setState(state);
        System.out.println("Enter zip code");
        String zipcode = s.next();
        contacts.setZipcode(zipcode);
        System.out.println("Enter phone number");
        String phoneNumber = s.next();
        contacts.setPhoneNumber(phoneNumber);
        System.out.println("Enter email id");
        String emailId = s.next();
        contacts.setEmailId(emailId);
        contactsArrayList.add(contacts);
        System.out.println(contacts.toString());
    }
}
