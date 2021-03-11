package com.kaldit.tutor.factory.session;

import com.kaldit.tutor.domain.session.Session;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

public class SessionFactory {
    public static Session build(Date startDateTime, Date endDate, String description){
        return Session.builder().id(UUID.randomUUID().toString()).endDateTime(endDate)
                .startingDateTime(startDateTime).description(description).build();
    }
}
