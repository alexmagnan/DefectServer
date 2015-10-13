package com.cs616;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ian on 15-10-02.
 */
public class DefectAssignedToValidator implements ConstraintValidator<DefectAssignedTo, Defect> {
    @Override
    public void initialize(DefectAssignedTo constraintAnnotation) {

    }

    @Override
    public boolean isValid(Defect value, ConstraintValidatorContext context) {
        switch(value.getStatus()){
            case CLOSED:
            case CREATED:
            case FIXED:
                return true;
            case ACCEPTED:
            case REOPENED:
                return value.getAssignedTo() != null;
        }
        return false;
    }
}
