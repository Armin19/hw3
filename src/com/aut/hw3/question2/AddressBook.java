package com.aut.hw3.question2;


import java.util.HashMap;

public class AddressBook {
    private HashMap<String, Contact> contactList;

    public AddressBook() {

    }

    /**
     * Name of this method is displayList.
     * It just shows the list of contacts in the hashMap.
     */
    private void diplayList() {
        System.out.println(contactList);
    }

    public void setContactList(HashMap<String, Contact> contactList) {
        this.contactList = contactList;
    }

    /**
     * Name of this method is sizeOfPhoneBook.
     * It just returns the size of ContactList.
     * @return
     */
    private int sizeOfPhoneBook() {
        int size = contactList.size();
        return size;
    }

    /**Name of the method is deleteContact.
     * It gets an object from Contact class and removes it in the HashMap.
     * @param contact
     */
    private void deleteContact(Contact contact) {
        contactList.remove(contact);
    }

    /**
     * Name of the method is addContact.
     * It gets a String and an object from Contact class and then adds it to the HashMap.
     * @param key
     * @param contact2
     */
    private void addContact(String key, Contact contact2) {
        contactList.put(key, contact2);
    }

    /**Name of the method is editContact.
     * It can edit contacts that exist in the HashMap by getting a String and an object from Contact class.
     * @param key2
     * @param contact3
     */
    private void editContact(String key2, Contact contact3) {
        deleteContact(contact3);
        addContact(key2, contact3);
    }

    public static void main(String[] args) {

    }
}
