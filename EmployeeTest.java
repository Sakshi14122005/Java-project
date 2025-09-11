package code;
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        System.out.println("\nEmployee Details:");
        emp.display();

        sc.close();
    }
}
