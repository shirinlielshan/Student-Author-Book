package com.example.studentbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;
import com.example.studentbook.dto.BookDto;
import com.example.studentbook.service.AuthorService;

@RestController
public class AuthorController {

    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }


    @PostMapping("/author/books")
    public BookDto createBook(@AuthenticationPrincipal User author, @RequestBody Book book){
        book.setAuthor(author);
        Book resultBook = authorService.createBook(author, book);
        return mapBookToDto(resultBook);
    }

    @DeleteMapping("/author/books/{id}")
    public void deleteBook(@PathVariable Long id){
        authorService.deleteBook(id);
    }


    private BookDto mapBookToDto(Book book){
        return BookDto.builder()
        .id(book.getId())
        .name(book.getName()).build();
    }
}
