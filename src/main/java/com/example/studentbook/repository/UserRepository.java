package com.example.studentbook.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    @Query("SELECT u.readingBooks FROM User u WHERE u.id = :userId")
    List<Book> findBooksByUserId(@Param("userId") Long userId);

    Optional<User> findByUsername(String username);
}
