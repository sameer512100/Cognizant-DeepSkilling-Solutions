package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        // Load the Spring application context from the XML file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean (with BookRepository already injected)
        BookService bookService = (BookService) context.getBean("bookService");

        // If this runs without a NullPointerException, dependency injection worked
        bookService.addBook("Clean Code");

        System.out.println("Dependency injection verified successfully.");
    }
}
