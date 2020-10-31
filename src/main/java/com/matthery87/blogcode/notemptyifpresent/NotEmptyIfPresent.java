package com.matthery87.blogcode.notemptyifpresent;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NotEmptyIfPresentValidator.class)
@Target( { ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmptyIfPresent {

    String message() default "Must not be empty if present";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
