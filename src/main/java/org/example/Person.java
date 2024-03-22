package org.example;

public class Person {
    String firstName;
    String lastName;

    int age;
    String email;
    int salary;
    String address;


    public Person(String firstName,String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstName,String lastName, int age,String email, int salary, String address){
        this(firstName, lastName, age);
        this.email= email;
        this.salary= salary;
        this.address= address;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return age;
    }

    public boolean isteen() {
        return this.age>=13 && this.age<=19;
    }
}
