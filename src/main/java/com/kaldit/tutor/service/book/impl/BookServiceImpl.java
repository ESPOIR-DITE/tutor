package com.kaldit.tutor.service.book.impl;

import com.kaldit.tutor.domain.book.Book;
import com.kaldit.tutor.repository.book.BookRepository;
import com.kaldit.tutor.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository = null;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> readAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findAllByEmailAndSessionId(String email, String sessionId) {
        return bookRepository.findAllByEmailAndSessionId(email, sessionId);
    }

    @Override
    public Optional<Book> findAllByEmail(String email) {
        return bookRepository.findAllByEmail(email);
    }
}
