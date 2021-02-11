package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {

    private HashMap<String, Set<String>> phoneMap = new HashMap<>();

    public void add (String lastName, String phoneNumber){
        if (phoneMap.containsKey(lastName)) {
            Set<String> number = phoneMap.get(lastName);
            number.add(phoneNumber);
            phoneMap.put(lastName,number);
        }
        else {
            Set<String> number = new HashSet<>();
            number.add(phoneNumber);
            phoneMap.put(lastName,number);
        }
    }

    public Set<String> get(String lastName) {
       return phoneMap.get(lastName);
    }
}
