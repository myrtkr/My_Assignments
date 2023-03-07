package wee3day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		ArrayList<Integer> missingNo = new ArrayList<Integer>();
		missingNo.add(1);
		missingNo.add(2);
		missingNo.add(3);
		missingNo.add(4);
		missingNo.add(8);
		missingNo.add(7);
		missingNo.add(6);
		
		Collections.sort(missingNo);
				
		for (int i=0; i< missingNo.size(); i++) {
			int m = missingNo.get(i);
			if(m != i+1) {
				System.out.println(i+1);
			}
			
		}
		
	}

}
