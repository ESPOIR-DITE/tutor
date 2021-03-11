package com.kaldit.tutor.repository.book;

import com.kaldit.tutor.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,String> {
    Optional<Book> findAllByEmailAndSessionId(String email,String sessionId);
    Optional<Book> findAllByEmail(String email);
}
