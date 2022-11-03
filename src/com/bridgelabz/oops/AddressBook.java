package com.bridgelabz.oops;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook {
    //UC1-CREATE A CONTACT IN ADDRESS BOOK
    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");
        AddressBook1 addressBook = new AddressBook1();
        addressBook.addContact();

        System.out.println(addressBook.contactsArrayList);
        System.out.println("*************");

        }

    }

