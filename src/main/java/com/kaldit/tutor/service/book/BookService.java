package com.kaldit.tutor.service.book;

import com.kaldit.tutor.domain.book.Book;
import com.kaldit.tutor.service.Service;

import java.util.Optional;

public interface BookService extends Service<Book,String> {
    Optional<Book> findAllByEmailAndSessionId(String email, String sessionId);
    Optional<Book> findAllByEmail(String email);
}
