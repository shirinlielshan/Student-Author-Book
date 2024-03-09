package com.example.studentbook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;
import com.example.studentbook.repository.BookRepository;
import com.example.studentbook.repository.UserRepository;
import com.example.studentbook.service.StudentService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentServiceImpl implements StudentService{

    private UserRepository userRepository;
    private BookRepository bookRepository;

    @Autowired
    public StudentServiceImpl(UserRepository userRepository, BookRepository bookRepository){
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findBooksByUserId(Long id) {
        return userRepository.findBooksByUserId(id);
    }

    public Book addBookToAuthUser(User user, Long id){
        Book book = bookRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Book not found"));
        user.getReadingBooks().add(book);
        userRepository.save(user);
        return book;
    }


}
