package com.kaldit.tutor.factory.book;

import com.kaldit.tutor.domain.book.Book;
import com.kaldit.tutor.utile.Generic;
import com.kaldit.tutor.utile.StringHelper;

import java.util.Date;
import java.util.Optional;

public class BookFactory {
    public static Optional<Book> build(String email, String session, Date date){
        Book book = null;
        if(Generic.isValidEmail(email)&& StringHelper.isEmptyOrNull(session))
             book= Book.builder().sessionId(session).date(date).email(email).build();
            return Optional.ofNullable(book);
    }
}
