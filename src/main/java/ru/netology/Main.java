package ru.netology;

import static ru.netology.PhoneBook.mapPhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        mapPhoneBook.put("Petya", "89057422934");
        mapPhoneBook.put("Vasya", "89992342342");
        mapPhoneBook.put("Nina", "89992344444");
        phoneBook.add("Ira","89108564723");
        phoneBook.add("Ira","89108564723");
        phoneBook.findByName("Vasya");
        phoneBook.findByName("Tolya");
        phoneBook.findByNumber("89057422934");
        phoneBook.findByNumber("89057422935");

        phoneBook.printAllNames(mapPhoneBook);

    }
}