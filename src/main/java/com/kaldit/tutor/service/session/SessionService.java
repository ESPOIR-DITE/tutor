package com.kaldit.tutor.service.session;

import com.kaldit.tutor.domain.session.Session;
import com.kaldit.tutor.domain.student.Student;
import com.kaldit.tutor.service.Service;

import java.util.Optional;

public interface SessionService extends Service<Session,String> {
    Optional<Session> read(String id);
    void delete(Session session);
    Session update(Session session);
}
