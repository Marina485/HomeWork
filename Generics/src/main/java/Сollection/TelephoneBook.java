package Сollection;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {
    private HashMap<String, String> book = new HashMap<>();

    public TelephoneBook() {
        this.book.clear();
    }

    public HashMap<String, String> getBook() {
        return book;
    }

    public void add(String tel, String name) {
        book.put(tel, name);
    }

    @Override
    public String toString() {
        return book.toString();
    }

    public ArrayList<String> get(String name) {
        ArrayList<String> numbers = new ArrayList<>();
        for (String n : book.keySet()) {
            if(book.get(n).equals(name)) {
                numbers.add(n);
            }
        }
        return numbers;
    }

}
