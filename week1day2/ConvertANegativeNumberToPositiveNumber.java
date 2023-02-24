package week1day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
	
		int num = -56;
		if(num<0) {
			System.out.println(num+" is negative");
			
			int p = num * -1;
			System.out.println(p + " is now positive");
			
		}else if(num>0) {
			System.out.println(num+" is positive");
		}else {
			System.out.println(num+" is neutral");
		}
	}

}
