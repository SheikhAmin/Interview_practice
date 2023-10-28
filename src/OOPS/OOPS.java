package OOPS;
import java.util.*;

class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    static String school;
    /*
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


    Student(){
        System.out.println("constructor called");
    }


    Student(Student st1){
       this.name = st1.name;
       this.age = st1.age;
    }

     */
    // Compile time polymorphism they are called function overloading
    public void printInfo(String name){
        System.out.println(name);

    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}

class OldMan{ //parent class
    String property;
}

// inheritance keyword ---> extends
class Amin extends OldMan{ //child class

}

class Shape{
     public void area(){
         System.out.println("displays area");
     }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(.5*l*h);
    }
}
class EuilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(.5*l*h);
    }
}

abstract class Animal{
    Animal(){
        System.out.println("you are creating a animal");
    }
   abstract void walk();
   public void eat(){
       System.out.println("animal eats");
   }
}
class Horse extends Animal{
    Horse(){
        System.out.println("you are creating a horse");
    }
    public void walk(){
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on two legs");
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.1416)*r*r);
    }
}

interface Animal1{
    public void walks();
    int eyes = 2;
}

interface FourLeged{

}
class Dog implements Animal1, FourLeged{
    public void walks(){
        System.out.println("walks on 4 legs");
    }
}
public class OOPS {
    public static void main(String[] args) {
         Pen pen1 = new Pen();
         pen1.color = "Black";
         pen1.type = "Gel";
        // pen1.write();

         Pen pen2 = new Pen();
         pen2.color = "Blue";
         pen2.type = "Ballpoint";

        // pen1.printColor();
         //pen2.printColor();

       // Student st = new Student();
       // st.name = "amin";
       // st.age = 25;
        //st.printInfo(st.name, st.age);

        Amin a = new Amin();
        a.property = "Land";

        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Dog dog = new Dog();
        dog.walks();

        Student.school = "Govt. Science College Attached High School";
    }
}
