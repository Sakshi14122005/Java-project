package code;
interface Shape {
 void area(); 
}

class Rectangle implements Shape {
 int length, breadth;

 Rectangle(int l, int b) {
     length = l;
     breadth = b;
 }

 public void area() {
     int a = length * breadth;
     System.out.println("Area of Rectangle: " + a);
 }
}

public class Main {
 public static void main(String[] args) {
     Rectangle rect = new Rectangle(10, 5);

     rect.area();
 }
}
