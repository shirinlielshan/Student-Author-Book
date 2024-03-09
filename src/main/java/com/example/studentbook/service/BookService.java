package com.example.studentbook.service;

import java.util.List;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;

public interface BookService {
    List<User> getReadersOfBook(Long id);

    List<Book> getAllBooks();
}
