package com.example.studentbook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;
import com.example.studentbook.repository.BookRepository;
import com.example.studentbook.service.BookService;

@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    @Override
    public List<User> getReadersOfBook(Long id) {
        return bookRepository.findUsersByBookId(id);
    }


    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
}
