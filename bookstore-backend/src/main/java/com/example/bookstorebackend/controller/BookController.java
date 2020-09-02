package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.models.Book;
import com.example.bookstorebackend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/listall")
    public Iterable<Book> listBooks(){
        return bookService.listBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    
    @DeleteMapping("/{bookId}") // "/book/12"
    public HttpStatus deleteBook(@PathVariable Long bookId) {
        return bookService.deleteBook(bookId);
    }
}
