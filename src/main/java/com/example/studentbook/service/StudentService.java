package com.example.studentbook.service;

import java.util.List;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;

public interface StudentService {
    
    List<Book> findBooksByUserId(Long id);

    Book addBookToAuthUser(User user, Long id);
}
