package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring IoC Container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve BookService bean from the Spring container
        BookService bookService = context.getBean("bookService", BookService.class);

        // Test Dependency Injection
        bookService.displayService();
    }
}