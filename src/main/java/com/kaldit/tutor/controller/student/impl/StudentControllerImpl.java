package com.kaldit.tutor.controller.student.impl;

import com.kaldit.tutor.controller.student.StudentController;
import com.kaldit.tutor.domain.student.Student;
import com.kaldit.tutor.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kaldit-tutor/student/")
public class StudentControllerImpl implements StudentController {
    private StudentService service;

    @Autowired
    public StudentControllerImpl(@RequestBody StudentService service) {
        this.service = service;
    }

    @PostMapping("create")
    @Override
    public Student create(@RequestBody Student student) {
        System.out.println(student.toString());
        return service.create(student);
    }

    @GetMapping("reads")
    @Override
    public List<Student> readAll() {
        return service.readAll();
    }

    @GetMapping("read")
    @Override
    public Student read(@RequestParam("id") String id) {
        return service.read(id).get();
    }

    @DeleteMapping("delete")
    @Override
    public void delete(@RequestBody Student student) {
        service.delete(student);
    }

    @PostMapping("update")
    @Override
    public Student update(@RequestBody Student student) {
        return service.update(student);
    }
}
