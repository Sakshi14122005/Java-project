package code;
import java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your rollno and name:");
		int rollno = sc.nextInt();
		String name = sc.next();
		System.out.println("Rollno:"+rollno+" Name:"+name);
		sc.close();
	}
}