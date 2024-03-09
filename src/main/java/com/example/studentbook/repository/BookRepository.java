package com.example.studentbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    @Query("SELECT u FROM User u JOIN u.readingBooks b WHERE b.id = :bookId")
    List<User> findUsersByBookId(@Param("bookId") Long bookId);
}
