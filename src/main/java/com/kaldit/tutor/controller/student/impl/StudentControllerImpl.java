package com.kaldit.tutor.controller.student.impl;

import com.kaldit.tutor.controller.student.StudentController;
import com.kaldit.tutor.domain.Student;
import com.kaldit.tutor.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kaldit-tutor/student/")
public class StudentControllerImpl implements StudentController {
    private StudentService service;

    @Autowired
    public StudentControllerImpl(StudentService service) {
        this.service = service;
    }

    @Override
    public Student create(Student student) {
        return service.create(student);
    }

    @Override
    public List<Student> readAll() {
        return service.realdAll();
    }

    @Override
    public Student read(String id) {
        return service.read(id).get();
    }

    @Override
    public void delete(Student student) {
        service.delete(student);
    }

    @Override
    public Student update(Student student) {
        return service.update(student);
    }
}
