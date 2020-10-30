package com.budwhite.studying.sample.library;

public class Model {
    private String someProperty;
    private int someOtherProperty;

    public Model(){}

    public Model(String someProperty, int someOtherProperty) {
        this.someProperty = someProperty;
        this.someOtherProperty = someOtherProperty;
    }

    public String getSomeProperty() {
        return someProperty;
    }

    public void setSomeProperty(String someProperty) {
        this.someProperty = someProperty;
    }

    public int getSomeOtherProperty() {
        return someOtherProperty;
    }

    public void setSomeOtherProperty(int someOtherProperty) {
        this.someOtherProperty = someOtherProperty;
    }

    @Override
    public String toString() {
        return "{" + someProperty + ", " + someOtherProperty + "}";
    }
}
