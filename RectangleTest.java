package code;
import java.util.Scanner;

class Rectangle {
    int length, width;

    
    Rectangle(int l, int w) {  //create constructor
        length = l;
        width = w;
    }

    int getArea() {
        return length * width;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        
        Rectangle rect = new Rectangle(length, width);  //object

        System.out.println("Area of Rectangle: " + rect.getArea());

        sc.close();
    }
}
