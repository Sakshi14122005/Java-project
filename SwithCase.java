package ifelse;
import java.util.Scanner;
public class SwithCase {
	

	
	
		 public static void main(String[] args) 
		 {
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("Enter the number 1-10");
		    	int no = sc.nextInt();
		    	switch(no) 
		    	{
		    	case 1 :System.out.println("One");
		               break;
		    	case 2 :System.out.println("Two");
		    	       break;
		    	case 3 :System.out.println("three");
		               break;
		    	case 4 :System.out.println("four");
		               break;
		    	case 5 :System.out.println("five");
		               break;
		    	case 6 :System.out.println("six");
		               break;
		    	case 7 :System.out.println("seven");
		               break;
		    	case 8 :System.out.println("seven");
	                   break;
	            case 9 :System.out.println("seven");
	                   break;
	            case 10 :System.out.println("seven");
	                   break;
	            default :System.out.println("number is not found");
		            }
		   sc.close();
		    }
	}


