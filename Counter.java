package Codechef;

public class Counter {
	 public static void main(String[] args) {
	        int i = 1; // Initialize counter

	        while (i <= 5) { // Loop from 1 to 5
	            if (i == 3) { // Check if the number is 3
	                i++; // Increment before skipping
	                continue; // Skip this iteration
	            }
	            System.out.println(i); // Print the number
	            i++; // Move to the next number
	        }
	    }
}