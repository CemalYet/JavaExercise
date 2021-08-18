package com.company;

import java.util.Scanner;

public class MainMobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }


    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update existing an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
    private static void addNewContact() {
        System.out.println("Enter new contact name :");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number");
        String phoneNumber = scanner.nextLine();
        MobileContacts newContact=MobileContacts.createContact(name,phoneNumber);
        if (mobilePhone.addContact(newContact)){
            System.out.println("New contact name "+newContact.getName()+" New contact phone number "+ newContact.getPhoneNumber());
        }else{
            System.out.println("Contact is already in the list");
        }
    }
    private static void updateContact(){
        MobileContacts contact = isExist();
        if (contact != null) {
            System.out.println("Enter new contact name");
            String newName = scanner.nextLine();
            System.out.println("Enter new phone number");
            String newPhoneNumber = scanner.nextLine();
            MobileContacts newContact = MobileContacts.createContact(newName, newPhoneNumber);
            if (mobilePhone.updateContact(contact, newContact)) {
                System.out.println("Successfully updated");
            } else {
                System.out.println("Error when updating");
            }
        }
    }

    private static void removeContact(){
        MobileContacts contact = isExist();
        if (contact != null) {
            if (mobilePhone.removeContact(contact)){
                System.out.println("Contact has been removed");
            }else{
                System.out.println("Error occurred when removed");

            }
        }

    }

    private static void queryContact(){
        System.out.println("Enter contact name");
        String currentName = scanner.nextLine();
        MobileContacts contact = mobilePhone.findContact(currentName);
        if (contact == null) {
            System.out.println("Contact is not found");
            return;
        }else {
            System.out.println("Contact name : "+contact.getName()+" phone number : "+contact.getPhoneNumber());
        }
    }
    private static MobileContacts isExist(){
        System.out.println("Enter contact name");
        String currentName = scanner.nextLine();
        MobileContacts contact = mobilePhone.findContact(currentName);
        if (contact == null) {
            System.out.println("Contact is not found");
            return null;
        }
       return contact;
    }

}
