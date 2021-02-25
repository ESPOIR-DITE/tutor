package com.kaldit.tutor.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Student {
    @Id @NonNull private String email;
    @NonNull private String name;
    private String nickName;
    @NonNull private String phoneNumber;
}
