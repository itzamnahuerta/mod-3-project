package com.example.bookstorebackend.repositories;

import com.example.bookstorebackend.models.Book;
import org.springframework.data.repository.CrudRepository;

// help us begin to interact with our database (CRUD)
public interface BookRepository extends CrudRepository<Book, Long> {
    
}
