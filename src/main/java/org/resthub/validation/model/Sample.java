package org.resthub.validation.model;

import org.hibernate.validator.constraints.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Entity
public class Sample {

    private Long id;

    private Boolean assertTrue;
    private boolean assertFalse;
    private BigDecimal decimalMax;
    private short decimalMin;
    private byte digits;
    private BigInteger max;
    private Integer min;
    private String notNull;
    private Integer nullValue;
    private Set<String> collSize;
    private String stringSize;
    private String pattern;
    private String creditCardNumber;
    private String email;
    private String length;
    private String notBlank;
    private String notEmpty;
    private String range;
    private String url;
    private String urlRegexp;
    private String urlDefault;
    private String urlComplete;
    private String ignoredProp;

    public Sample() {
        super();
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getNotNull() {
        return notNull;
    }

    public void setNotNull(String notNull) {
        this.notNull = notNull;
    }

    @Null
    public Integer getNullValue() {
        return nullValue;
    }

    public void setNullValue(Integer nullValue) {
        this.nullValue = nullValue;
    }

    @Size(min = 2, max = 10)
    @ElementCollection(targetClass = String.class)
    public Set<String> getCollSize() {
        return collSize;
    }

    public void setCollSize(Set<String> collSize) {
        this.collSize = collSize;
    }

    @NotNull
    @Size(min = 2, max = 5)
    public String getStringSize() {
        return stringSize;
    }

    public void setStringSize(String stringSize) {
        this.stringSize = stringSize;
    }

    @Pattern(regexp = "^(0|[1-9][0-9]*)$")
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @URL(protocol = "http", host = "localhost", port = 8080)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Range(max = 200)
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @NotEmpty
    public String getNotEmpty() {
        return notEmpty;
    }

    public void setNotEmpty(String notEmpty) {
        this.notEmpty = notEmpty;
    }

    @NotBlank
    public String getNotBlank() {
        return notBlank;
    }

    public void setNotBlank(String notBlank) {
        this.notBlank = notBlank;
    }

    @Length
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @CreditCardNumber
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @URL(regexp = "url-test")
    public String getUrlRegexp() {
        return urlRegexp;
    }

    public void setUrlRegexp(String urlRegexp) {
        this.urlRegexp = urlRegexp;
    }

    @URL
    public String getUrlDefault() {
        return urlDefault;
    }

    public void setUrlDefault(String urlDefault) {
        this.urlDefault = urlDefault;
    }

    @URL(protocol = "ftp", host = "resthub", port = 8080, regexp="^.*url-test.*$")
    public String getUrlComplete() {
        return urlComplete;
    }

    public void setUrlComplete(String urlComplete) {
        this.urlComplete = urlComplete;
    }

    @AssertTrue
    public Boolean isAssertTrue() {
        return assertTrue;
    }

    public void setAssertTrue(Boolean assertTrue) {
        this.assertTrue = assertTrue;
    }

    @AssertFalse
    public boolean isAssertFalse() {
        return assertFalse;
    }

    public void setAssertFalse(boolean assertFalse) {
        this.assertFalse = assertFalse;
    }

    @DecimalMax("10.5")
    public BigDecimal getDecimalMax() {
        return decimalMax;
    }

    public void setDecimalMax(BigDecimal decimalMax) {
        this.decimalMax = decimalMax;
    }

    @DecimalMin("0.5")
    public short getDecimalMin() {
        return decimalMin;
    }

    public void setDecimalMin(short decimalMin) {
        this.decimalMin = decimalMin;
    }

    @Digits(integer = 2, fraction = 3)
    public byte getDigits() {
        return digits;
    }

    public void setDigits(byte digits) {
        this.digits = digits;
    }

    @Max(1000)
    public BigInteger getMax() {
        return max;
    }

    public void setMax(BigInteger max) {
        this.max = max;
    }

    @NotNull
    @Min(1)
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @NotNull
    public String getIgnoredProp() {
        return ignoredProp;
    }

    public void setIgnoredProp(String ignoredProp) {
        this.ignoredProp = ignoredProp;
    }
}
