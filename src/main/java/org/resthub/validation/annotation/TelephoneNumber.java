package org.resthub.validation.annotation;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@ReportAsSingleViolation
@Pattern(regexp = "")
public @interface TelephoneNumber {

    String message() default "{org.resthub.validator.constraints.TelephoneNumber.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * @return an additional regular expression the annotated string must match. The default is any string ('.*')
     */
    @OverridesAttribute(constraint = Pattern.class, name = "regexp") String regexp() default ".*";

    /**
     * @return used in combination with {@link #regexp()} in order to specify a regular expression option
     */
    @OverridesAttribute(constraint = Pattern.class, name = "flags") Pattern.Flag[] flags() default {};
}
