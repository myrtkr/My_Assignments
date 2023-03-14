package week3day3;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		Set<Integer> secondL=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			secondL.add(data[i]);
		}
		System.out.println(secondL);
		List<Integer> secList = new ArrayList<Integer>(secondL);
		int a= secList.get(4);
		System.out.println("Second largest No. is: "+a);
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */

	}

}
