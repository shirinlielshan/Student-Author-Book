package com.example.studentbook.service;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;

public interface AuthorService {
    
    public Book createBook(User user, Book book);

    public void deleteBook(Long id);
}
