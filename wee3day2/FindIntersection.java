package wee3day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindIntersection {

	public static void main(String[] args) {
		ArrayList<Integer> match = new ArrayList<Integer>();
		match.add(3);
		match.add(2);
		match.add(11);
		match.add(4);
		match.add(6);
		match.add(7);
		System.out.println(match);
		ArrayList<Integer>match1 = new ArrayList<Integer>();
		match1.add(1);
		match1.add(2);
		match1.add(8);
		match1.add(4);
		match1.add(9);
		match1.add(7);
		System.out.println(match1);
		Collections.sort(match);
		System.out.println(match);
		Collections.sort(match1);
		System.out.println(match1);
		Object[] m0 = match.toArray();
		Object[] m1 = match1.toArray();
		for (int i=0; i<m0.length; i++) {
			for (int j = 0; j <m1.length; j++) {
				if(m0[i]==m1[j]) {
					System.out.println(m0[i]);
				}
			}
		}
			

	}

}
