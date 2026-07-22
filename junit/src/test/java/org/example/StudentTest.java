package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testGetMessage() {
        Student student = new Student();
        assertEquals("Welcome to JUnit!", student.getMessage());
    }
}