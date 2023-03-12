package assignments.week1;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int [] number = {1,4,8,5,3,6,7};
		//sort the array in ascending order
		Arrays.sort(number);
		//output:2
		//iterate the value from 0 to array length
		for (int i = 0; i < number.length; i++) {
	       //to check the index value if not matched print the missing number
			if (number[i]!=i+1) {
				System.out.println(i+1);
				break;	
			}
		}
	}
	}

