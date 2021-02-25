package com.kaldit.tutor.utile;

import org.apache.commons.validator.routines.EmailValidator;

public class Generic {
    public static boolean isValidEmail(String email) {
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }
}
