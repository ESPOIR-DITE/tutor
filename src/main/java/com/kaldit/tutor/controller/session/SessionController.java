package com.kaldit.tutor.controller.session;

import com.kaldit.tutor.controller.Controller;
import com.kaldit.tutor.domain.session.Session;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.Optional;

public interface SessionController extends Controller<Session,String> {
    Optional<Session> read(String id, HttpServletRequest request);
    void delete(Session session,HttpServletRequest request);
    Session update(Session session,HttpServletRequest request);
}
