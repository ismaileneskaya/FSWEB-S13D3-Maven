package org.example;

public class Person {
    String firstName;
    String lastName;

    int age;
    String email;
    double salary;
    String address;

    public Person(String firstName,String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String email, double salary, String address){
        this.email= email;
        this.salary=salary;
        this.address=address;
    }
}
