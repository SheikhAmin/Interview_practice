package Practice;


class Student{
    String name;
    int age;
    protected double result;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void setRsult(double rsult){
        this.result = rsult;
    }
    public void getResult(){
        System.out.println(this.result);
    }
    Student(){
        System.out.println("default constructor called");
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    Student(Student s1){
        System.out.println("copy constructor called");
    }
    public void displayInfo(){
        System.out.println("display info");
    }
    public void displayInfo(String name){
        System.out.println("displaying " + name);
    }
}

class Shape{
    public void area(){
        System.out.println("Displaying the area");
    }
}

class Triangle extends Shape{
    public void area(int h, int b){
        System.out.println((0.5)*h*b);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int a){
        System.out.println((.5)*a*a);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.1416*r*r);
    }
}

abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("animal called");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse created");
    }

    @Override
    void walk() {
        System.out.println("horse walks on 4 legs");
    }
}

interface Human{
    void write();
}

class Man implements Human{
    public void write(){
        System.out.println("man can write");
    }
    public static void info(){
        System.out.println("this is static method");
    }
}
public class OOP {
    public static void main(String[] args) {
        Student s1 = new Student("amin",25);
        Student s2 = new Student(s1);
        Student s3 = new Student();
        s3.displayInfo("amin");
        Shape s = new Shape();
        Triangle t =new Triangle();
        t.area(10,5);
        s1.setRsult(3.30);
        s1.getResult();

        Horse h = new Horse();
        h.walk();

        Man m = new Man();
        m.write();
    }
}
