package org.example;

import java.util.*;

public class PhoneBook {

    Map<String, String> person = new TreeMap();

    public int add(String name, String number) {
        if (!person.containsKey(name)) {
            person.put(name, number);
        }
        return person.size();
    }

    public String findByNumber (String number) {
        return person.entrySet()
                .stream()
                .filter((x) -> x.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }

    public String findByName(String name) {
        return person.get(name);
    }

    public String printAllNames() {
        List<String> names = new ArrayList<>();
        person.forEach((key, value) -> names.add(key));
        Collections.sort(names);
        return names.toString();
    }
}
