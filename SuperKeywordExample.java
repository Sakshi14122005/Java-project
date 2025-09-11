package code;

class Animal0 {
    String color = "white";
}

class Dog extends Animal0 {
    String color = "black";

    void printColor() {
        System.out.println("Child class color: " + color);        // Current class variable
        System.out.println("Parent class color: " + super.color); // Parent class variable
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
