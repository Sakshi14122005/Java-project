package Inheritance;
//Parent class
class Animal123 {
void eat() {
   System.out.println("Animal is eating");
}
}

//Child class inheriting from Animal
class Dog extends Animal123 {
void bark() {
   System.out.println("Dog is barking");
}
}

//Sub-child class inheriting from Dog
class Labrador extends Dog {
void display() {
   System.out.println("Labrador is a type of Dog");
}
}

public class Multilevel {
public static void main(String[] args) {
   Labrador labrador = new Labrador();
   labrador.eat();   // Inherited from Animal
   labrador.bark();  // Inherited from Dog
   labrador.display();  // Defined in Labrador class
}
}