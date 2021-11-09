package HOMEWORK.HW4;

import java.util.HashMap;
import java.util.Map;

public class DTwo {
    public static void main(String[] args) {
        Map<String , Integer  > phonebook = new HashMap<>();

        phonebook.put("Иванов", 555);
        phonebook.put("Петров", 111);
        phonebook.put("Сидоров", 222);
        phonebook.put("Верхов", 333);
        phonebook.put("Иванов", 444);

        System.out.println(phonebook.get("Иванов"));

        for (String key: phonebook.keySet()){
            System.out.printf("ФИО: %s, номер :%d, \n", key, phonebook.get(key)); // перебор ключей
        }
    }
}
