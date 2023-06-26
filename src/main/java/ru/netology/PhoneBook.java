package ru.netology;

import java.time.LocalDateTime;
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
        for (Map.Entry<String, String> kv :  mapPhoneBook.entrySet()) {
            if (kv.getValue().equals(newNumber)){
                return kv.getKey();
            }
        }
        System.out.println("Контакт с указанным номером не найден");
        return null;
    }
    public String findByName(String newName) {
        return null;
    }

}
