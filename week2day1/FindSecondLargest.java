package week2day1;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {

		
		int[] data = {3,2,11,4,6,7};
		System.out.println(data.length);
		
		Arrays.sort(data);
		for (int i = 0; i < data.length-1; i++) {
			if(i==4)
			System.out.println(data[4]);
		}

		
		
	}

}
