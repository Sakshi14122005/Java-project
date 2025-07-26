package Product;
import java.util.Scanner;
public class Program {
	String name;
	double salary;
	Program(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Name:-"+name);
		System.out.println("Salary:-"+salary);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:-");
		String Name=sc.next();
		System.out.println("Enter employee salary:-");
		double salary=sc.nextDouble();
		Program p1=new Program(Name, salary);
	    p1.display();
		
	}
	

}
