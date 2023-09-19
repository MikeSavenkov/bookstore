package com.msavenkov.bookstore.service;

import com.msavenkov.bookstore.entity.Book;
import com.msavenkov.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> fetchBookList() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book updateBook(Book book, Long bookId) {
        Book bookDB = bookRepository.findById(bookId).get();

        if (nonNull(book.getAuthor()) && !"".equalsIgnoreCase(book.getAuthor())) {
            bookDB.setAuthor(book.getAuthor());
        }
        if (nonNull(book.getName()) && !"".equalsIgnoreCase(book.getName())) {
            bookDB.setName(book.getAuthor());
        }

        return bookRepository.save(bookDB);
    }

    @Override
    public void deleteBookById(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
