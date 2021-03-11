package com.kaldit.tutor.controller.student.impl;

import com.kaldit.tutor.controller.student.StudentLevelController;
import com.kaldit.tutor.domain.student.StudentLevel;
import com.kaldit.tutor.service.student.StudentLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kaldit-tutor/student-level/")
public class StudentLevelControllerImpl implements StudentLevelController {
    private StudentLevelService service;


    @Autowired
    public StudentLevelControllerImpl(StudentLevelService service) {
        this.service = service;
    }

    @PostMapping("create")
    @Override
    public StudentLevel create(@RequestBody StudentLevel studentLevel) {
        return service.create(studentLevel);
    }

    @GetMapping("reads")
    @Override
    public List<StudentLevel> readAll() {
        return service.readAll();
    }

    @GetMapping("findAllByStudentEmail")
    @Override
    public List<StudentLevel> findAllByStudentEmail(@RequestParam("studentEmail") String studentEmail) {
        return service.findAllByStudentEmail(studentEmail);
    }

    @GetMapping("findAllByLevelId")
    @Override
    public List<StudentLevel> findAllByLevelId(@RequestParam("levelId") String levelId) {
        return service.findAllByLevelId(levelId);
    }

    @DeleteMapping("delete")
    @Override
    public void deleteAllByLevelIdAndStudentEmail(@RequestParam("studentEmail") String studentEmail,@RequestParam("levelId") String levelId) {
        service.deleteAllByLevelIdAndStudentEmail(studentEmail,levelId);
    }
}
