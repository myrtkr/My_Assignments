package week3day3;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetRemoveDuplicates {
	public static void main(String[] arg) {
		int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		
		Set<Integer> num1 = new LinkedHashSet<Integer>();
		Set<Integer> num2 = new HashSet<Integer>();
		
		for (int i=0; i< num.length; i++ ) {
			if(!num1.add(num[i])) {
				num2.add(num[i]);
			}
		}
		System.out.println(num1);
		System.out.println(num2);
		
		/*
		 * Remove Duplicates:
int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8}
i.declear a set
ii. hint (i need random order)
iii.Iterate through a loop and add data
iv.print values
output will be.{3,5,7,2,9,1,54,8,4,6}

		 * 
		 */
		
		
	}

}
