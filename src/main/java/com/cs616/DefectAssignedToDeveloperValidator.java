package com.cs616;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ian on 15-10-08.
 */
public class DefectAssignedToDeveloperValidator implements ConstraintValidator<DefectAssignedToDeveloper, Defect> {
    @Override
    public void initialize(DefectAssignedToDeveloper constraintAnnotation) {

    }

    @Override
    public boolean isValid(Defect value, ConstraintValidatorContext context) {
        return true;
    }
}
