package com.matthery87.blogcode.notemptyifpresent;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyIfPresentValidator implements ConstraintValidator<NotEmptyIfPresent, Object> {

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {

        if (object == null) {

            return true;
        }

        if (object instanceof List) {

            List<?> list = (List<?>) object;

            return !list.isEmpty();
        }

        if (object instanceof String) {

            String string = (String) object;

            return !string.isEmpty();
        }

        return true;
    }

}
