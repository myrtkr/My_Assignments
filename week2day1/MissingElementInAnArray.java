package week2day1;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		// I am stuck in this one:
		
				int[] arr = {1,2,3,4,7,6,8};
				
				//System.out.println(arr[0]);
				
				Arrays.sort(arr);
				for (int i = arr[0]; i<= arr.length-1; i++) {
					arr[i] = arr[i] +1;
					if(i != arr[i]) {
						System.out.println(i);
					
					} 
				}

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration*/

	}

}
