package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] mas = {"red", "sun", "dog", "cat", "red", "cat", "milk", "tea", "sea", "sun", "black", "red"};

        HashMap<String, Integer> elCount = new HashMap<>();
        for (String ma : mas) {
            if (!elCount.containsKey(ma)) {
                elCount.put(ma, 1);
            }
            else {
                elCount.replace(ma, elCount.get(ma)+1);
            }
        }
        System.out.println("исходный массив:");
        System.out.println(Arrays.toString(mas));
        System.out.println("Число упоминаний слова в массиве:");
        System.out.println(elCount);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "87647722130");
        phoneBook.add("Иванов", "87561112123");
        phoneBook.add("Ивановq", "89747722155");
        phoneBook.add("Петров", "89347224144");
        phoneBook.add("Петров", "88004151020");

        System.out.println("Номера Иванова: "+phoneBook.get("Иванов"));

    }

}
