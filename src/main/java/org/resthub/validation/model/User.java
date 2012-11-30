package org.resthub.validation.model;

import org.hibernate.validator.constraints.*;
import org.resthub.validation.annotation.TelephoneNumber;

import javax.validation.constraints.*;
import java.util.List;

public class User {

    @NotNull
    @Length(min = 8)
    private String login;

    @NotNull
    @Length(min = 8)
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")
    private String password;

    @NotNull
    @Email
    private String email;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Range(min = 18, max = 130)
    private Integer age;

    @URL(protocol = "http")
    private String webSiteURL;

    @NotNull
    @AssertTrue
    private Boolean cgaAccepted;

    @NotEmpty
    @Size(min = 1, max = 3)
    private List<String> interests;

    @CreditCardNumber
    private String creditCardNumber;

    @TelephoneNumber
    private String telephoneNumber;

}
