package com.example.bookstorebackend.service;

import com.example.bookstorebackend.models.Book;
import com.example.bookstorebackend.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository; // will make one instance of the object = singleton

    @Override
    public Iterable<Book> listBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public HttpStatus deleteBook(Long id) {
        bookRepository.deleteById(id);
        return HttpStatus.OK;
    }
}

