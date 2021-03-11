package com.kaldit.tutor.domain.session;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Builder(toBuilder = true)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Session {
    @Id private String id;
    private Date startingDateTime;
    private Date endDateTime;
    private String description;
}
