package ru.childnov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonSergeyChildinovTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getBestHobby() {
        PersonSergeyChildinov sergey = PersonSergeyChildinov.getInstance();
        Assertions.assertTrue(sergey.getBestHobby().equals("Чтение старинных книг"));
    }

    @Test
    void getFullName() {
        PersonSergeyChildinov sergey = PersonSergeyChildinov.getInstance();
        Assertions.assertTrue(sergey.getFullName().equals("Чильдинов Сергей Михайлович"));
    }

    @Test
    void getCity() {
        PersonSergeyChildinov sergey = PersonSergeyChildinov.getInstance();
        Assertions.assertTrue(sergey.getCity().equals("Санкт-Петербург"));
    }
    
}