package com.kaldit.tutor.service.student;

import com.kaldit.tutor.domain.student.Student;
import com.kaldit.tutor.service.Service;

import java.util.Optional;

public interface StudentService extends Service<Student,String> {
    Optional<Student> read(String id);
    void delete(Student student);
    Student update(Student student);
}
