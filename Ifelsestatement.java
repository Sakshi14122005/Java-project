package ifelse;
import java.util.Scanner;
public class Ifelsestatement {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Age");
			int A = sc.nextInt();
			if(A > 18)
				{
				System.out.println("You are eligible to vote");
				}
			else {
				System.out.println("You are not eligible to vote yet");
			}
			sc.close();
			}
}