package com.example.studentbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;
import com.example.studentbook.repository.BookRepository;
import com.example.studentbook.repository.UserRepository;
import com.example.studentbook.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

    private UserRepository userRepository;

    private BookRepository bookRepository;

    @Autowired
    public AuthorServiceImpl(UserRepository userRepository, BookRepository bookRepository){
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public Book createBook(User user, Book book) {
        user.getAuthoredBooks().add(book);
        userRepository.save(user);
        return book;
    }

    @Override
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);
    }
    
}
