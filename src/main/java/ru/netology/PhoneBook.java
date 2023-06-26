package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static Map<String, String> mapPhoneBook = new HashMap<>();
    public int add(String newName, String newNumber){
        if(mapPhoneBook.containsKey(newName)){
            System.out.println("Контакт с данным именем существует. Введите другое имя");
            return mapPhoneBook.size();
        }
        mapPhoneBook.put(newName,newNumber);
        return mapPhoneBook.size();
    }
    public String findByNumber(String newNumber){
        return null;

    }
}
