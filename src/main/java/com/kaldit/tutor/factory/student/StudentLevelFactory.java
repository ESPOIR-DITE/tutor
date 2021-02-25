package com.kaldit.tutor.factory.student;

import com.kaldit.tutor.domain.StudentLevel;

public class StudentLevelFactory {
    public static StudentLevel build(String levelId,String studentEmail){
        return  StudentLevel.builder().levelId(levelId).studentEmail(studentEmail).build();
    }
}
