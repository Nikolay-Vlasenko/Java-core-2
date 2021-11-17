package ru.geekbrains.java_core2.lesson3;

import java.util.*;


public class HomeWorkApp3 {
    public static void main(String[] args) {
    List <String> words = Arrays.asList(
                "Банан",
                "Яблоко",
                "Вишня",
                "Арбуз",
                "Киви",
                "Манго",
                "Малина",
                "Клубника",
                "Банан",
                "Киви",
                "Слива",
                "Гранат",
                "Груша",
                "Манго"
    );

    Set <String> unique = new HashSet<>(words);
        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Сколько раз встречается каждое слово");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }


        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Ivanov", "Ivanov-phone-1");
        phonebook.add("Sidorov", "Sidorov-phone-1");
        phonebook.add("Ivanov", "Ivanov-phone-2");
        phonebook.add("Petrov", "Petrov-phone-1");
        phonebook.add("Kuznecov", "Kuznecov-phone-1");
        phonebook.add("Petrov", "Petrov-phone-2");

        System.out.println("Ivanov: " + phonebook.get("Ivanov"));
        System.out.println("Sidorov: " + phonebook.get("Sidorov"));
        System.out.println("Petrov: " + phonebook.get("Petrov"));
        System.out.println("Kuznecov: " + phonebook.get("Kuznecov"));

    }


}
