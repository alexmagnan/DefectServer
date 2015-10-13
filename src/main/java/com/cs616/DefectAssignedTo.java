package com.cs616;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ian on 15-10-02.
 */
@Constraint(validatedBy = DefectAssignedToValidator.class)
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DefectAssignedTo {
    String message() default "{Defect assignedTo is mandatory for ACCEPTED and REOPENED status.}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
