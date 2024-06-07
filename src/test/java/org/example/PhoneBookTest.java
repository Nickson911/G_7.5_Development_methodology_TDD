package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    void startTest() {
        System.out.println("Начало теста");
        phoneBook = new PhoneBook();
    }

    @AfterEach
    void endTest() {
        System.out.println("Окончание теста");
        phoneBook = null;
    }

    @Test
    void addTest() {
        String name = "Миша";
        String number = "+7(111) 222-33-44";
        int expected = 1;
        Assertions.assertEquals(expected, phoneBook.add(name, number));
    }

    @Test
    void findByNumberTest() {
        phoneBook.add("Миша", "+7(111) 222-33-44");
        String expected = "Петя";
        Assertions.assertEquals(expected, phoneBook.findByNumber("+7(111) 222-33-44"));
    }
}