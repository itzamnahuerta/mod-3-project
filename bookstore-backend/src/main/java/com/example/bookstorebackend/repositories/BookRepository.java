package com.example.bookstorebackend.repositories;

import com.example.bookstorebackend.models.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;

// help us begin to interact with our database (CRUD)
public interface BookRepository extends CrudRepository<Book, Long> {
    @Query(value = "delete from books where books.title = ?1", nativeQuery = true)
    public HttpStatus deleteByTitle(String title);
}
