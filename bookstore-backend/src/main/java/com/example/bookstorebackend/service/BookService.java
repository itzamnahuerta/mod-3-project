package com.example.bookstorebackend.service;

import com.example.bookstorebackend.models.Book;
import org.springframework.http.HttpStatus;

public interface BookService {
    public Iterable<Book> listBooks();
    Book createBook(Book book);
    public HttpStatus deleteBook(Long id);
}
