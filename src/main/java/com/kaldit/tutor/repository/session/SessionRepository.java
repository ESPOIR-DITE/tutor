package com.kaldit.tutor.repository.session;

import com.kaldit.tutor.domain.session.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session,String> {
}
