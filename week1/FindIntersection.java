package assignments.week1;

import java.util.Arrays;

public class FindIntersection {
	public static void main(String[] args) {
	//declare the int array values
	int[] num1 = {2,3,5,4,7,9,8};
	int[] num2 = {11,21,2,3,5,9};
	//sort the values in ascending order
	Arrays.sort(num1);
	Arrays.sort(num2);
	//initialize the for loop
	for (int i = 0; i < num1.length; i++) {
		for (int j = 0; j < num2.length; j++) {
			if (num1[i]==num2[j]) {
			System.out.println(num1[i]);		
			}
			
		}
		
	}
 }
}