package Product;
import java.util.Scanner;

public class Product {

	    String name;
	    double price;

	    static String category;

	    static {
	        category = "Electronics";
	    }


	    Product(int id, String name, double price)
	    {
	        this.id = id;
	        this.name = name;
	        this.price = price;

	        System.out.println("\n--- Product Details ---");
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Price: " + price);
	        System.out.println("Category: " + category);
	    }
	}




	
