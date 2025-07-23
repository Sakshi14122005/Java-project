
package bank;
import java.util.Scanner;
public class BankAccount 
{
	    public static String bankName;  //static method

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter bank name: ");
	        bankName = sc.nextLine();

	        System.out.println("Bank Name is: " + bankName);

	        sc.close();
	    }
	}

