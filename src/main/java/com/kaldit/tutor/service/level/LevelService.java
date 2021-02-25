package com.kaldit.tutor.service.level;

import com.kaldit.tutor.domain.level.Level;
import com.kaldit.tutor.domain.student.Student;
import com.kaldit.tutor.service.Service;

import java.util.Optional;

public interface LevelService extends Service<Level,String> {
    Optional<Level> read(String id);
    void delete(Level level);
    Level update(Level level);
}
