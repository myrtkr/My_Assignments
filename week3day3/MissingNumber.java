package week3day3;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {1,3,4,5,8,7,9,6};
		
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(num[0]);
		num1.add(num[1]);
		num1.add(num[2]);
		num1.add(num[3]);
		num1.add(num[4]);
		num1.add(num[5]);
		num1.add(num[6]);
		num1.add(num[7]);
		System.out.println(num1);
		Set<Integer> missing= new TreeSet<Integer>(num1);
		
		for (int i = 1; i <= num1.size(); i++) {
				
			if(!missing.contains(i)){
				
				System.out.println("missing No. is: "+i);
							
			}
			
			}
			
		}

	

}
