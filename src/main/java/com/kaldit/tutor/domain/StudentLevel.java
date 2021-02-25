package com.kaldit.tutor.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Objects;

@ToString @Builder @Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@IdClass(StudentLevel.StudentLevelId.class)
public class StudentLevel {
    @NonNull @Id private String studentEmail, levelId;

    protected static class StudentLevelId implements Serializable{
        private String studentEmail, levelId;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StudentLevelId that = (StudentLevelId) o;
            return studentEmail.equals(that.studentEmail) && levelId.equals(that.levelId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentEmail, levelId);
        }
    }

}
