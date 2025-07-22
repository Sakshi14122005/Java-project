package scanner;
import java.util.Scanner;
public class ScannerAdd 
{
	public static void main(String[] args)
	{
		int a,b;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter first number: ");
		    a = sc.nextInt();
		    System.out.print("Enter second number: ");
			 b = sc.nextInt();
			 //Arithametic Operation
			 System.out.println("Addition: " + (a + b));
		     System.out.println("Subtraction: " + (a - b));
		     System.out.println("Multiplication: " + (a * b));
		     System.out.println("Division: " + (a/b));
		     System.out.println("Remainder : " + (a%b));
		  // Comparison operations
		     System.out.println("Greater than :" + (a > b));
		        System.out.println("Less than: " + (a < b));
		        System.out.println("Equal to equal: " + (a == b));
		        System.out.println("Not equal: " + (a != b));
		        sc.close();
    }
}


	     


	        
	 

	        

	        
	       
	        

