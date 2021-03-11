package com.kaldit.tutor.domain.subscription;

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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@IdClass(Subscription.SubscriptionId.class)
public class Subscription {
    @Id
    private String email;
    private String levelId;
    private Date date;
    private Boolean stat;
    protected static class SubscriptionId implements Serializable{
        private String email;
        private String sessionId;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SubscriptionId that = (SubscriptionId) o;
            return Objects.equals(email, that.email) && Objects.equals(sessionId, that.sessionId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(email, sessionId);
        }
    }
}
