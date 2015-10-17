package uk.gov.ipt.validators.date;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Christian Sterzl
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidDateValidator.class)
public @interface ValidDate {
  String format() default "yyyy-MM-dd";

  String message() default "Not a valid date";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}