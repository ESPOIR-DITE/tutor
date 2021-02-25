package com.kaldit.tutor.controller.student;

import com.kaldit.tutor.controller.Controller;
import com.kaldit.tutor.domain.StudentLevel;

import java.util.List;

public interface StudentLevelController extends Controller<StudentLevel,String> {
    List<StudentLevel> findAllByStudentEmail(String studentEmail);
    List<StudentLevel> findAllByLevelId(String levelId);
    void deleteAllByLevelIdAndStudentEmail(String studentEmail,String levelId);
}
