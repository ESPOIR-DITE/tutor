package com.kaldit.tutor.repository.student;

import com.kaldit.tutor.domain.student.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface FinanceRepository extends JpaRepository<Finance,String> {
    Optional<Finance> findAllByEmail(String email);
    Optional<Finance> findFinanceByEmailAndDate(String email, Date date);
}
