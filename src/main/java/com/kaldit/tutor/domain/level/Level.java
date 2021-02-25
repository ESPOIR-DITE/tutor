package com.kaldit.tutor.domain.level;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder(toBuilder = true)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Level {
    @Id
    private String id;
    private String name;
    private String description;
}
