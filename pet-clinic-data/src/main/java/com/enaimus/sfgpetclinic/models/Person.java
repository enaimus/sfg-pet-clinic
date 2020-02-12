package com.enaimus.sfgpetclinic.models;

public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person() {
    }
}
