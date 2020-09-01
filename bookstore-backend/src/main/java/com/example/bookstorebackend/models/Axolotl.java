package com.example.bookstorebackend.models;

public class Axolotl {
    private String name;
    private int age;

    public String getName() {
        return name;
    } // this is a getter

    public void setName(String name) {
        this.name = name;
    } // this is a setter, update the name we want to set to the variable name

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
