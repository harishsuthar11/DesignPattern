package com.example.builderdesignpattern;

import org.apache.logging.log4j.Logger.*;

import java.util.logging.Logger;

public class UserBuilder {

    String firstName;
    String lastName;

    //Optional Parameters
    int age;
    String address;
    String phone;

    private static Logger log = Logger.getLogger(UserBuilder.class.getName());
    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder withAge(int age) {
        log.fine("Setting Age");
        this.age = age;
        return this;
    }
    public UserBuilder withPhone(String phone) {

        log.fine("Setting Phone");
        this.phone = phone;
        return this;
    }
    public UserBuilder withAddress(String address) {

        log.fine("Setting Address");
        this.address = address;
        return this;
    }
    //Return the finally consrcuted User object
    public User build() {
        return new User(this);
    }

}
