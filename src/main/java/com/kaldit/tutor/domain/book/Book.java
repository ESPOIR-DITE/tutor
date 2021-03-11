package com.kaldit.tutor.domain.book;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Builder(toBuilder = true)
@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@IdClass(Book.BookId.class)
public class Book {
    @Id @NotNull private String email;
    @NotNull private String sessionId;
    private Date date;

    protected static class BookId implements Serializable{
        private String email;
        private String sessionId;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BookId bookId = (BookId) o;
            return Objects.equals(email, bookId.email) && Objects.equals(sessionId, bookId.sessionId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(email, sessionId);
        }
    }

}
