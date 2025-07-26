package Product;

public class Product1 {
            int id;
		    String name;
		    double price;
		     String category;
		    {
		        category = "Computer Science";
		    }


		    Product1(int id, String name, double price)
		    {
		        this.id = id;
		        this.name = name;
		        this.price = price;
		    }
               void display()
               {
            	   
		        System.out.println(" Product Details");
		        System.out.println("ID: " + id);
		        System.out.println("Name: " + name);
		        System.out.println("Price: " + price);
		        System.out.println("Category: " + category);
		    }
		}

