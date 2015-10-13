package com.cs616;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ian on 15-10-02.
 */
public class DefectHourRangeValidator implements ConstraintValidator<DefectHourRange, Defect> {

    @Override
    public void initialize(DefectHourRange constraintAnnotation) {

    }

    @Override
    public boolean isValid(Defect value, ConstraintValidatorContext context) {
        if(value.getModified() == null)
            return true;
        else
            return value.getCreated().before(value.getModified());
    }
}
