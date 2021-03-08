package com.codedifferently.lab01;

public class Human {

    private String name;
    private String email;
    private Boolean emailVerified;
    private String address;
    private Integer age;

    public Human(){

    }


    public Human(String name, String email, Boolean emailVerified, String address, Integer age) {
        this.name = name;
        this.email = email;
        this.emailVerified = emailVerified;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
