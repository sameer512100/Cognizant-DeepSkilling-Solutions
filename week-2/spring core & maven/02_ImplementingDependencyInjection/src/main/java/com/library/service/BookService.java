package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method used by Spring to inject the BookRepository dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookTitle) {
        System.out.println("Adding book: " + bookTitle);
        bookRepository.save(bookTitle);
    }
}
