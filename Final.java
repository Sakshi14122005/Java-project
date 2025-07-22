package abc;
import java.util.Scanner;

public class Final {
public static void main(String[] args)
{
	final float pi=3.14f;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of a circle");
	float radius = sc.nextFloat();
	float Area=pi*radius*radius;
	System.out.println("Area of circle is :" +Area);
	sc.close();
	
}
}
