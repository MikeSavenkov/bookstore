package com.msavenkov.bookstore.service;

import com.msavenkov.bookstore.entity.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    List<Book> fetchBookList();
    Book updateBook(Book book, Long id);
    void deleteBookById(Long bookId);
}
