package bank;
import java.util.Scanner;
public class Employee {
	static String companyName;
	int Id;
	String Name;
	float Salary;
	static {
		companyName="Future Developer";
	}
	Employee(int Id,String Name,float Salary)
	{
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}
	void Display()
	{
		System.out.println("Employee Id :" +Id);
		System.out.println("Employee Name :" +Name);
		System.out.println("Employee Salary :" +Salary);
		System.out.println("Employee Company Name :" +companyName);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Student Id :-");
		int id=sc.nextInt();
		System.out.println("\nEnter Student Name :-");
		String name=sc.next();
		System.out.println("\nEnter Student Salary :-");
		float salary=sc.nextFloat();
		Employee e1=new Employee(id,name,salary);
		sc.close();
	}
	
	
	
}
