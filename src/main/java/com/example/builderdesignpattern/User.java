package com.example.builderdesignpattern;

public class User {

    //Required Parameters
    private  String firstName;
    private  String lastName;

    //Optional Parameters
    private  int age;
    private  String address;
    private  String phone;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    User(UserBuilder userBuilder){

        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;

    }

}
