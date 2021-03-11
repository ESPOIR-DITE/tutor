package com.kaldit.tutor.controller.session.impl;

import com.kaldit.tutor.controller.access.ClientCheck;
import com.kaldit.tutor.controller.session.SessionController;
import com.kaldit.tutor.domain.session.Session;
import com.kaldit.tutor.factory.session.SessionFactory;
import com.kaldit.tutor.service.session.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kaldit-tutor/session/")
public class SessionControllerImpl implements SessionController {
    private SessionService service;
    @Autowired
    public SessionControllerImpl(SessionService service) {
        this.service = service;
    }


    @PostMapping("create")
    @Override
    public Session create(@RequestBody Session session) {
        Session session1 = SessionFactory.build(session.getStartingDateTime(),session.getEndDateTime(),session.getDescription());
        return service.create(session1);
    }

    @GetMapping("reads")
    @Override
    public List<Session> readAll() {
        return service.readAll();
    }

    @GetMapping("read")
    @Override
    public Optional<Session> read(@RequestParam("id") String id, HttpServletRequest request) {
        ClientCheck.ipCheck(request);
        return service.read(id);
    }

    @DeleteMapping("delete")
    @Override
    public void delete(Session session, HttpServletRequest request) {

    }

    @PostMapping("update")
    @Override
    public Session update(@RequestBody Session session, HttpServletRequest request) {
        return service.update(session);
    }
}
