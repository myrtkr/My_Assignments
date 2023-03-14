package week3day3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a1={3,2,11,4,6,7};
		int[] a2 = {1,2,8,4,9,7};
		
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(a1[0]);
		num1.add(a1[1]);
		num1.add(a1[2]);
		num1.add(a1[3]);
		num1.add(a1[4]);
		num1.add(a1[5]);
		System.out.println(num1);
		
		List<Integer> num2 = new ArrayList<Integer>();
		num2.add(a2[0]);
		num2.add(a2[1]);
		num2.add(a2[2]);
		num2.add(a2[3]);
		num2.add(a2[4]);
		num2.add(a2[5]);
		
		System.out.println(num2);
		
		for (int i = 0; i < num1.size(); i++) {
			for (int j = 0; j < num2.size(); j++) {
				if(num1.get(i)==num2.get(j)) {
					System.out.println(num1.get(i));
				}
			}
		}
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */

	}

}
