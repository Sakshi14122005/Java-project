package stud.abc;
import java.util.Scanner;

public class StudInfo 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=sc.next();
	System.out.println("Enter Your Age");
	int age=sc.nextInt();	
	System.out.println("Enter Your Gender");
	String gender=sc.next();
	System.out.println("Enter Your Percentage");
	float percentage=sc.nextFloat();
	System.out.println("Enter Your Name" +name);
	System.out.println("Enter Your Age" +age);
	System.out.println("Enter Your Gender" +gender);
	System.out.println("Enter Your Percentage" +percentage);
	sc.close();
}
}
