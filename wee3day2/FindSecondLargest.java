package wee3day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		ArrayList<Integer> largeSecond = new ArrayList<Integer>();
		largeSecond.add(3);
		largeSecond.add(2);
		largeSecond.add(11);
		largeSecond.add(4);
		largeSecond.add(6);
		largeSecond.add(7);
		
		Collections.sort(largeSecond);
		int secondLargets =largeSecond.get(4);
		
		System.out.println("second largest No. is "+secondLargets);
		

	}

}
