package com.kaldit.tutor.repository.student;

import com.kaldit.tutor.domain.StudentLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentLevelRepository extends JpaRepository<StudentLevel,String> {
    List<StudentLevel> findAllByStudentEmail(String studentEmail);
    List<StudentLevel> findAllByLevelId(String levelId);
    void deleteAllByLevelIdAndStudentEmail(String studentEmail,String levelId);
}
