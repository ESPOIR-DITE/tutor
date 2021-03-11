package com.kaldit.tutor.controller.student;

import com.kaldit.tutor.controller.Controller;
import com.kaldit.tutor.domain.student.Finance;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Optional;

public interface FinanceController extends Controller<Finance,String> {
    Optional<Finance> findFinanceByEmailAndDate(String email, Date date, HttpServletRequest request);
    Optional<Finance> findAllByEmail(String email,HttpServletRequest request);
}
