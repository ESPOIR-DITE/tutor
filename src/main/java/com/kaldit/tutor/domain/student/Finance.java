package com.kaldit.tutor.domain.student;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE )
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(Finance.FinanceId.class)
public class Finance {
    @Id private String email;
    private Date date;
    private double amount;
    private String operation;

    protected static class FinanceId implements Serializable{
        private String email;
        private Date date;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FinanceId financeId = (FinanceId) o;
            return Objects.equals(email, financeId.email) && Objects.equals(date, financeId.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(email, date);
        }
    }

}
