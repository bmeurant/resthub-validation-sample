package org.resthub.validation.validator;

import org.resthub.validation.annotation.TelephoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;

public class TelephoneNumberValidator implements ConstraintValidator<TelephoneNumber, CharSequence> {

    private java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
            "^[+]?([0-9]*[\\.\\s\\-\\(\\)]|[0-9]+){3,24}$",
            java.util.regex.Pattern.CASE_INSENSITIVE
    );

    public void initialize(TelephoneNumber annotation) {
    }

    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        if (value == null || value.length() == 0) {
            return true;
        }
        Matcher m = pattern.matcher(value.toString());
        return m.matches();
    }
}
