package com.kaldit.tutor.controller.student;

import com.kaldit.tutor.controller.Controller;
import com.kaldit.tutor.domain.Student;

import java.util.Optional;

public interface StudentController extends Controller<Student,String> {
    Student read(String id);
    void delete(Student student);
    Student update(Student student);
}
