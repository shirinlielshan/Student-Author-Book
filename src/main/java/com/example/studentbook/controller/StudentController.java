package com.example.studentbook.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;
import com.example.studentbook.dto.BookDto;
import com.example.studentbook.service.StudentService;

@RestController
public class StudentController {
    
    private StudentService studentService;

    @Autowired
    private StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/student/books")
    public List<BookDto> getAllBooks(@AuthenticationPrincipal User user){
        return mapBooksToDTO(studentService.findBooksByUserId(user.getId()));
    }

    @PutMapping("/student/books/{id}")
    public BookDto readBook(@AuthenticationPrincipal User user, @PathVariable("id") Long id){
        return mapBookToDto(studentService.addBookToAuthUser(user, id));
    }


    private List<BookDto> mapBooksToDTO(List<Book> books){

        List<BookDto> result = books.stream().map(
            book -> BookDto.builder()
            .id(book.getId())
            .name(book.getName()).build()
        ).collect(Collectors.toList());

        return result;
    }


    private BookDto mapBookToDto(Book book){
        return BookDto.builder()
        .id(book.getId())
        .name(book.getName()).build();
    }


}
