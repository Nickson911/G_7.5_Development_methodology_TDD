package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook;
    public String name1 = "Миша";
    public String name2 = "Петя";
    public String number1 = "7_111_222_33_44";
    public String number2 = "7_222_333_44_55";

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
        int expected = 1;
        Assertions.assertEquals(expected, phoneBook.add(name1, number1));
    }

    @Test
    void findByNumberTest() {
        phoneBook.add(name1, number1);
        phoneBook.add(name2, number2);
        Assertions.assertEquals(name1, phoneBook.findByNumber(number1));
    }
}