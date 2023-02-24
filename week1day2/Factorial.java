package week1day2;

public class Factorial {

	 /* Goal: Find the Factorial of a given number
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 */	
	
	public static void main(String[] args) {
		int input = 5;
		int fact = 1;
		
		for (int i = 1; i<=input; i++ ) {
			fact = i*fact;
			
		}
		System.out.println(fact);

	}

}
