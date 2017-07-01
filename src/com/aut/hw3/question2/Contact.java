package com.aut.hw3.question2;


public class Contact {
    private int birthYear;
    private String phoneNumber;
    private String address;

    public Contact(int birthYear1, String phoneNumber1, String address1) {
        this.birthYear = birthYear1;
        this.phoneNumber = phoneNumber1;
        this.address = address1;
    }

    public Contact() {

    }

    public Contact(String phoneNumber2, String address2) {
        this.phoneNumber = phoneNumber2;
        this.address = address2;
    }

    public Contact(int birthYear3, String phoneNumber3) {
        this.birthYear = birthYear3;
        this.phoneNumber = phoneNumber3;
    }

    public static void main(String[] args) {

    }

}
