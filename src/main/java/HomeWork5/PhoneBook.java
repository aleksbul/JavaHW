package HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    public PhoneBook() {

    }

    private static Map<String, ArrayList<String>> phoneBook = new HashMap<>();


    public void add(String surName, String phoneNumber) {
        if (phoneBook.containsKey(surName)) {
            phoneBook.get(surName).add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(surName, numbers);
        }
    }

    public ArrayList<String> get(String surName) {
        System.out.println(surName + " " + phoneBook.get(surName));
        return phoneBook.get(surName);

    }
}
