package Сollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WordList {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList("Один", " Два", " Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь",
                                      "Один", " Два", "Один", " Два", "Один", " Два", "Один", "Десять"));

        System.out.println(wordList.toString());
        HashSet<String> unicWord = new HashSet<>();
        unicWord.addAll(wordList);
        System.out.println(unicWord.toString());
        System.out.println(unicWord.size());

        //Telephone book
        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.add("44922", "Лапшин");
        telephoneBook.add("45579", "Голубев");
        telephoneBook.add("43511", "Клочков");
        telephoneBook.add("44956", "Лапшин");
        telephoneBook.add("45570", "Семенов");
        telephoneBook.add("43515", "Иванов");

        System.out.println(telephoneBook.toString());

        System.out.println(telephoneBook.get("Лапшин"));
        System.out.println(telephoneBook.get("Голубев"));
    }
}
