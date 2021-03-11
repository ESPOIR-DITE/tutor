package com.kaldit.tutor.factory.student;

import com.kaldit.tutor.domain.student.Finance;
import com.kaldit.tutor.utile.Generic;

import java.util.Date;
import java.util.Optional;

public class FinanceFactory {
    public static Optional<Finance> build(String email, String operation, double amount, Date date){
        Finance finance = null;
        if(Generic.isValidEmail(email))
            finance = Finance.builder().amount(amount).email(email).date(date).operation(operation).build();
        return Optional.ofNullable(finance);
    }
}
