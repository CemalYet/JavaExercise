package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<MobileContacts> mobileContactsList ;

    public MobilePhone() {
        this.mobileContactsList = new ArrayList<MobileContacts>();
    }

    public boolean addContact(MobileContacts contact){
        if(findContact(contact.getName())==null){
        mobileContactsList.add(contact);
        }else{
            System.out.println(contact.getName()+" is already in your contacts");
            return false;
        }
        return true;
    }

    public boolean updateContact(MobileContacts oldContact,MobileContacts newContact){
        int indexOfOld = findContactIndex(oldContact);
        if (indexOfOld >= 0) {
            mobileContactsList.set(indexOfOld,newContact);
            System.out.println(oldContact.getName()+" is replaced with "+newContact.getName());
            return true;
        }else if(findContact(newContact.getName())!= null){
            System.out.println("Contact with name "+newContact.getName()+" already exist in the list");
            return false;
        }
        System.out.println(oldContact.getName()+" is not found in the list");
        return false;
    }

    public boolean removeContact(MobileContacts contact){
        int index = findContactIndex(contact);
        if (index >= 0 ){
            mobileContactsList.remove(index);
            System.out.println(contact.getName()+" is removed from the list");
            return true;
        }
        return false;
    }

    private int findContactIndex(MobileContacts contact){
        return mobileContactsList.indexOf(contact);
    }

    public MobileContacts findContact(String contactName){
        for (MobileContacts contact:mobileContactsList
             ) {
            if (contact.getName().equals(contactName)){
                return contact;
            }
            
        }
        return null;
    }

     public void printContacts(){
         for (MobileContacts contact:this.mobileContactsList
              ) {
             System.out.println(contact.getName()+" ----> "+contact.getPhoneNumber());
         }
     }

}
