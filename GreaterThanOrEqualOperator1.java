package practice;

public class GreaterThanOrEqualOperator1 {
	
	    public static void main(String[] args) {
	        int legalAge = 18;  // Minimum age to vote
	        int personAge = 20; // Age of the person

	        // Write code to compare and print result in given format
	        boolean canVote = personAge >= legalAge;
	        System.out.println("Is the person eligible to vote? " + canVote);
	    }
	}



