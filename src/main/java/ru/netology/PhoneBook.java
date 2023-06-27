package ru.netology;

import java.util.*;


public class PhoneBook {
    public static Map<String, String> mapPhoneBook = new HashMap<>();

    public int add(String newName, String newNumber) {
        if (mapPhoneBook.containsKey(newName)) {
            System.out.println("Контакт с данным именем существует. Введите другое имя");
            return mapPhoneBook.size();
        }
        mapPhoneBook.put(newName, newNumber);
        return mapPhoneBook.size();
    }

    public String findByNumber(String newNumber) {
        for (Map.Entry<String, String> kv : mapPhoneBook.entrySet()) {
            if (kv.getValue().equals(newNumber)) {
                return kv.getKey();
            }
        }
        System.out.println("Контакт с указанным номером не найден");
        return null;
    }

    public String findByName(String newName) {
        for (Map.Entry<String, String> kv : mapPhoneBook.entrySet()) {
            if (kv.getKey().equals(newName)) {
                return kv.getValue();
            }
        }
        System.out.println("Контакт с указанным именем не найден");
        return null;
    }
    public List<String> printAllNames(Map<String, String> map) {
        return null;

    }
    /*public void printAllNames(Map<String, String> map) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> kv : map.entrySet()) {
            list.add(kv.getKey());

        }
        List<String> sortedList = list.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        sortedList.forEach(System.out::println);*/
    }







