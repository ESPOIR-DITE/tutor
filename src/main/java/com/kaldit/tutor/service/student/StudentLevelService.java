package com.kaldit.tutor.service.student;

import com.kaldit.tutor.domain.StudentLevel;
import com.kaldit.tutor.service.Service;

import java.util.List;
import java.util.Optional;

public interface StudentLevelService extends Service<StudentLevel,String> {
    List<StudentLevel> findAllByStudentEmail(String studentEmail);
    List<StudentLevel> findAllByLevelId(String levelId);
    void deleteAllByLevelIdAndStudentEmail(String studentEmail,String levelId);
}
