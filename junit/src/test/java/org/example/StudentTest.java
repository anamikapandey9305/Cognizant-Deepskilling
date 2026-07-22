package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testGetMessage() {

        Student student = new Student();

        assertEquals("Welcome to JUnit!", student.getMessage());
    }
}