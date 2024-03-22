
package org.example;

public class Main {
    public static void main(String[] args){
      /* Person person = new Person("John", "Doe", 20);
       System.out.println("Firstname: " + person.getFirstName());
       System.out.println("LastName: " + person.getLastName());
       System.out.println("Age: " + person.getAge());
       System.out.println("Age: " + person.isteen());
       Person person1 = new Person("John","Doe",18,"Johndoe@gmail.com",55000,"Englend");
       Person person2 = new Person("Ali","Birinci",25);
       Person person3 = new Person("şukufe","üçüncü",13,"sukufeucuncu@gmail.com",67000,"Kayseri");
       Person person4 = new Person("Ahmet","Pehlivan",27);
        System.out.println("Firstname: " + person3.getFirstName());
        System.out.println("LastName: " + person3.getLastName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Age: " + person3.isteen());*/
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}





