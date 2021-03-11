package com.kaldit.tutor.controller.book.impl;

import com.kaldit.tutor.controller.book.BookController;
import com.kaldit.tutor.domain.book.Book;
import com.kaldit.tutor.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kaldit-tutor/book/")
public class BookControllerImpl implements BookController {
    private BookService service;

    @Autowired
    public BookControllerImpl(BookService service) {
        this.service = service;
    }

    @PostMapping("cerate")
    @Override
    public Book create(@RequestBody Book book) {
        return service.create(book);
    }

    @GetMapping("reads")
    @Override
    public List<Book> readAll() {
        return service.readAll();
    }

    @GetMapping("findAllByEmailAndSessionId")
    @Override
    public Optional<Book> findAllByEmailAndSessionId(@RequestParam("email") String email,@RequestParam("sessionId") String sessionId, HttpServletRequest request) {
        return service.findAllByEmailAndSessionId(email, sessionId);
    }

    @GetMapping("findAllByEmail")
    @Override
    public Optional<Book> findAllByEmail(@RequestParam("email") String email, HttpServletRequest request) {
        return service.findAllByEmail(email);
    }
}
