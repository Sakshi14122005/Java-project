package ifelse;
import java.util.Scanner;
public class Remark {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Grade:");

		char grade = sc.next().charAt(0);
		if(grade=='A')
		{
		     System.out.println("A=Excellent");
		}
		else if(grade=='B')
		{
		     System.out.println("B=Good");
		}
		else if(grade=='C')
		{
		     System.out.println("C=Average");
		}
		else if(grade=='D')
		{
		     System.out.println("D=Poor");
		}	
		else if(grade=='F')
		{
		     System.out.println("F=Fail");
		}	
		System.out.println("Enter the grade into remarks:");
		sc.close();
	}

}
