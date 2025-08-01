package ifelse;
import java.util.Scanner;

public class Arithmeticifelse {
	public static void main(String[] ards)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 10;
		int num2 = 55;

		System.out.println("Enter first number:");
		num1 = sc.nextInt();

		System.out.println("Enter second number:");
		num2 = sc.nextInt();

		sc.nextLine(); 

		System.out.println("Enter the addition:");
		System.out.println("Enter the subtraction:");
		System.out.println("Enter the multiplication:");
		System.out.println("Enter the division:");

		String op = sc.nextLine(); 

		if (op.equals("addition"))
		{
			System.out.println("Enter the addition:" + (num1 + num2));
		}
		if (op.equals("subtraction"))
		{
			System.out.println("Enter the subtraction :" + (num1 - num2));
		}
		if (op.equals("multiplication"))
		{
			System.out.println("Enter the multiplication:" + (num1 * num2));
		}
		if (op.equals("division"))
		{
			System.out.println("Enter the division:" + (num1 / num2));
		}

		System.out.println("Enter select operation:-");
		sc.close();
	}
}
