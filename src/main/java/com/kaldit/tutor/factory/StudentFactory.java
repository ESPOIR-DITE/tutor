package com.kaldit.tutor.factory;

import com.kaldit.tutor.domain.Student;
import com.kaldit.tutor.utile.Generic;

import java.util.Optional;

public class StudentFactory {
    public static Optional<Student> build(String email,String name, String nickName,String phoneNumber){
        Student student = null;
        if(Generic.isValidEmail(email)){
            student = Student.builder().name(name).nickName(nickName).email(email).phoneNumber(phoneNumber).build();
        }
        return Optional.ofNullable(student);
    }
}
