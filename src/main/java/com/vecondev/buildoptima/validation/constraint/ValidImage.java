package com.vecondev.buildoptima.validation.constraint;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import com.vecondev.buildoptima.validation.validator.NotNullFile;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = NotNullFile.class)
public @interface ValidImage {

  String message() default "{The field can be null but not empty}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
