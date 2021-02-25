package com.kaldit.tutor.controller.student;

import com.kaldit.tutor.controller.Controller;
import com.kaldit.tutor.domain.student.Student;

public interface StudentController extends Controller<Student,String> {
    Student read(String id);
    void delete(Student student);
    Student update(Student student);
}
