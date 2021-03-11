package com.kaldit.tutor.service.student;

import com.kaldit.tutor.domain.student.Finance;
import com.kaldit.tutor.service.Service;

import java.util.Date;
import java.util.Optional;

public interface FinanceService extends Service<Finance,String> {
    Optional<Finance> findFinanceByEmailAndDate(String email, Date date);
    Optional<Finance> findAllByEmail(String email);
}
