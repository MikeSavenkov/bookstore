package com.msavenkov.bookstore.controller;

import com.msavenkov.bookstore.entity.Book;
import com.msavenkov.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/books")
    public List<Book> fetchBookList() {
        return bookService.fetchBookList();
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable("id") Long bookId) {
        return bookService.updateBook(book, bookId);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable("id") Long bookId) {
        bookService.deleteBookById(bookId);
        return "Deleted Successfully";
    }

}
