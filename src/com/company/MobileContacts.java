package com.company;

public class MobileContacts {
    private String name;
    private String phoneNumber;

    public MobileContacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //The method is defined as a static since i want to use it in main.
    public static MobileContacts createContact(String name,String phoneNumber){
        MobileContacts contact = new MobileContacts(name,phoneNumber);
        return  contact;
    }

}
