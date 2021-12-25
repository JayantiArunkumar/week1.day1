package week1.day1;

public class Factorial {
	
	public static void main(String[] args) {
		
		int input =5; //Input
		
		int fact=1;
		
		for(int i=1;i<=input;i++)
		{
			fact=fact*i; // Calculating factorial
		}
		System.out.println("Factorial of 5: "+fact);
	}

}
