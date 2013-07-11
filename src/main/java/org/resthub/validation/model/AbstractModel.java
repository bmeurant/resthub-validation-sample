package org.resthub.validation.model;

public abstract class AbstractModel {

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }

    private String testField;


}
