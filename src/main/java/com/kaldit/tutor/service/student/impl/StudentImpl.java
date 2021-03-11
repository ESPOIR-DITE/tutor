package com.kaldit.tutor.service.student.impl;

import com.kaldit.tutor.domain.student.Student;
import com.kaldit.tutor.repository.student.StudentRepository;
import com.kaldit.tutor.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> readAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> read(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }
}
