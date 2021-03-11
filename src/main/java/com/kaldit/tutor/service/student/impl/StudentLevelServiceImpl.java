package com.kaldit.tutor.service.student.impl;

import com.kaldit.tutor.domain.student.StudentLevel;
import com.kaldit.tutor.repository.student.StudentLevelRepository;
import com.kaldit.tutor.service.student.StudentLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentLevelServiceImpl implements StudentLevelService {
    private StudentLevelRepository studentLevelRepository;

    @Autowired
    public StudentLevelServiceImpl(StudentLevelRepository studentLevelRepository) {
        this.studentLevelRepository = studentLevelRepository;
    }

    @Override
    public StudentLevel create(StudentLevel studentLevel) {
        return studentLevelRepository.save(studentLevel);
    }

    @Override
    public List<StudentLevel> readAll() {
        return studentLevelRepository.findAll();
    }

    @Override
    public List<StudentLevel> findAllByStudentEmail(String studentEmail) {
        return studentLevelRepository.findAllByStudentEmail(studentEmail);
    }

    @Override
    public List<StudentLevel> findAllByLevelId(String levelId) {
        return studentLevelRepository.findAllByLevelId(levelId);
    }

    @Override
    public void deleteAllByLevelIdAndStudentEmail(String studentEmail, String levelId) {

    }
}
