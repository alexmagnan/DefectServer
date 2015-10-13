package com.cs616;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ian on 15-10-08.
 */
@Constraint(validatedBy = DefectAssignedToDeveloperValidator.class)
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface DefectAssignedToDeveloper {
    String message() default "{Defect assignedTo user who must be DEVELOPER.}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
