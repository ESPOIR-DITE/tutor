package com.kaldit.tutor.controller.book;

import com.kaldit.tutor.controller.Controller;
import com.kaldit.tutor.domain.book.Book;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public interface BookController extends Controller<Book,String> {
    Optional<Book> findAllByEmailAndSessionId(String email, String sessionId, HttpServletRequest request);
    Optional<Book> findAllByEmail(String email,HttpServletRequest request);
}
