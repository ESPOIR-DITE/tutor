package com.kaldit.tutor.service.session.impl;

import com.kaldit.tutor.domain.session.Session;
import com.kaldit.tutor.repository.session.SessionRepository;
import com.kaldit.tutor.service.session.SessionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SessionImpl implements SessionService {
    private SessionRepository sessionRepository;

    @Autowired
    public SessionImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public Session create(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public List<Session> readAll() {
        return sessionRepository.findAll();
    }


    @Override
    public Optional<Session> read(String id) {
        return sessionRepository.findById(id);
    }

    @Override
    public void delete(Session session) {
        sessionRepository.delete(session);
    }

    @Override
    public Session update(Session session) {
        return sessionRepository.save(session);
    }
}
