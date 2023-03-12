package assignments.week1;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] number= {1,5,9,2,6,3,5,4,8,7};
		//to get the size of array
		int size=number.length;
		//sort the array
		Arrays.sort(number);
		int array = number[size-2];
		//print the value
		System.out.println("Second largest number is : "+array);
		
}
}
