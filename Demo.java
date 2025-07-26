package Product;
import java.util.Scanner;
public class Demo {
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter ID: ");
	        int id = sc.nextInt(); 
	        sc.nextLine();

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Price: ");
	        double price = sc.nextDouble();
	        Product1 p = new Product1(id, name, price);

	        sc.close();
	    }
	}

