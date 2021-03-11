package com.kaldit.tutor.service.student.impl;

import com.kaldit.tutor.domain.student.Finance;
import com.kaldit.tutor.service.student.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FinanceServiceImpl implements FinanceService {
    private FinanceService financeService;

    @Autowired
    public FinanceServiceImpl(FinanceService financeService) {
        this.financeService = financeService;
    }

    @Override
    public Finance create(Finance finance) {
        return financeService.create(finance);
    }

    @Override
    public List<Finance> readAll() {
        return financeService.readAll();
    }

    @Override
    public Optional<Finance> findFinanceByEmailAndDate(String email, Date date) {
        return financeService.findFinanceByEmailAndDate(email, date);
    }

    @Override
    public Optional<Finance> findAllByEmail(String email) {
        return financeService.findAllByEmail(email);
    }
}
