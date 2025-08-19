package Operator;

public class MixOperator {
	
	    public static void main(String[] args) {
	        // Define variables
	        int a = 10, b = 5, c = 2;
	        boolean result;

	        int calculation = a + b * c - 4 / 2; 

	        result = a > b && b < c || a + c < b * 2; 
	        System.out.println(calculation); 
	        System.out.println(result); 
	    }
	}

