package ifelse;
import java.util.Scanner;
public class Weekday {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number(1-7):");
		int dayNumber=sc.nextInt();
		if(dayNumber==1)
		{
			System.out.println("SUNDAY");
		}
		else if(dayNumber==2)
		{
			System.out.println("MONDAY");
		}
		else if(dayNumber==3)
		{
			System.out.println("TUESDAY");
		}
		else if(dayNumber==4)
		{
			System.out.println("WEDNESDAY");
		}
		else if(dayNumber==5)
		{
			System.out.println("THURSDAY");
		}
		else if(dayNumber==6)
		{
			System.out.println("FRIDAY");
		}
		else if(dayNumber==7)
		{
			System.out.println("SATURDAY");
		}
		System.out.println("Enter the number from(1-7):");
		sc.close();
		
	
	}
}
