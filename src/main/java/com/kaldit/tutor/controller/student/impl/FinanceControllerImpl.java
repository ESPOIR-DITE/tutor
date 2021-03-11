package com.kaldit.tutor.controller.student.impl;

import com.kaldit.tutor.controller.access.ClientCheck;
import com.kaldit.tutor.controller.student.FinanceController;
import com.kaldit.tutor.domain.student.Finance;
import com.kaldit.tutor.service.student.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kaldit-tutor/finance/")
public class FinanceControllerImpl implements FinanceController {
    private FinanceService financeService;

    @Autowired
    public FinanceControllerImpl(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("findFinanceByEmailAndDate")
    @Override
    public Optional<Finance> findFinanceByEmailAndDate(@RequestParam("email") String email,@RequestParam("date") Date date, HttpServletRequest request) {
        ClientCheck.ipCheck(request);
        return financeService.findFinanceByEmailAndDate(email,date);
    }

    @GetMapping("findAllByEmail")
    @Override
    public Optional<Finance> findAllByEmail(@RequestParam("email") String email, HttpServletRequest request) {
        ClientCheck.ipCheck(request);
        return financeService.findAllByEmail(email);
    }

    @PostMapping("create")
    @Override
    public Finance create(@RequestBody Finance finance) {
        return financeService.create(finance);
    }

    @GetMapping("reads")
    @Override
    public List<Finance> readAll() {
        return financeService.readAll();
    }
}
