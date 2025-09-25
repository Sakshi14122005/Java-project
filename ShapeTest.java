package Codechef;
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Triangle();

        s1.draw();  // Drawing Circle
        s2.draw();  // Drawing Square
        s3.draw();  // Drawing Triangle
    }
}

