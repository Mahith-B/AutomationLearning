package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an int Input and assign a value 13
				// Declare a boolean variable flag as false
				// Iterate from 2 to half of the input
					// Divide the input with each for loop variable and check the remainder
					// Set the flag as true when there is no remainder
					// break the iterator
				// Check the flag (Provide a condition)
					// Print 'Prime' when the condition matches
					// Print 'Not a Prime' when the condition doesn't match 
		
		
		int n=14; 
		boolean flag=false;
		for (int i=2; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println("Number is Not a Primenumber");
				flag=true;
				break;
			}
			if(flag==false) {
				System.out.println("Number is Prime number");
				break;
			}
			
		}
		
		
	}

}
