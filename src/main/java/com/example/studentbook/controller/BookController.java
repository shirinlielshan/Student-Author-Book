package com.example.studentbook.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentbook.domain.Book;
import com.example.studentbook.domain.User;
import com.example.studentbook.dto.BookDto;
import com.example.studentbook.dto.UserDto;
import com.example.studentbook.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/{id}/readers")
    public List<UserDto> readersOfBook(@PathVariable Long id){
        return mapUsersToDTO(bookService.getReadersOfBook(id));
    }


    @GetMapping("/books")
    public List<BookDto> getAllBooks(){
        return mapBooksToDTO(bookService.getAllBooks());
    }


    private List<UserDto> mapUsersToDTO(List<User> users){

        List<UserDto> result = users.stream().map(
            user -> UserDto.builder()
                                 .id(user.getId())
                                 .username(user.getUsername())
                                 .age(user.getAge())
                                 .build() 
        ).collect(Collectors.toList());
        return result;
    }

    private List<BookDto> mapBooksToDTO(List<Book> books){

        List<BookDto> result = books.stream().map(
            book -> BookDto.builder()
            .id(book.getId())
            .name(book.getName()).build()
        ).collect(Collectors.toList());

        return result;
    }
}
