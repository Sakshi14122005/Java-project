package ifelse;
import java.util.Scanner;
public class Statement1 {
	    public static void main(String[] args) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the day no.");
	    	int no = sc.nextInt();
	    	switch(no) 
	    	{
	    	case 1 :System.out.println("Sunday");
	                break;
	    	case 2 :System.out.println("Monday");
	    	        break;
	    	case 3 :System.out.println("Tuesday");
	                break;
	    	case 4 :System.out.println("Wednesday");
	                break;
	    	case 5 :System.out.println("Thusday");
	                break;
	    	case 6 :System.out.println("Saturday");
	                break;
	    	case 7 :System.out.println("Friday");
	                break;
	    	default :System.out.println("Day is not found");
	            }
	   sc.close();
	    }
	    }

