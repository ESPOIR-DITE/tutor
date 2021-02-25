package com.kaldit.tutor.controller.level;

import com.kaldit.tutor.controller.Controller;
import com.kaldit.tutor.domain.level.Level;
import com.kaldit.tutor.domain.student.Student;

public interface LevelController extends Controller<Level,String> {
    Level read(String id);
    void delete(Level level);
    Level update(Level level);
}
