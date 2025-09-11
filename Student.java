package code;
import java.util.Scanner;

class StudentTest {
    String name;
    int age;
    float grade;

    // Constructor
    StudentTest(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student info
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter student grade: ");
        float grade = sc.nextFloat();

     
        StudentTest s1 = new StudentTest(name, age, grade);  //create object using constructor

      
        System.out.println("\nStudent Information:");
        s1.display();

        sc.close();
    }
}
