package assignments.week1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//declare two string variables with values
		String str1 = "race";
		String str2 = "care";
		
		//to find the length of the string and store it in integer variable
		int length1 = str1.length();
		int length2 = str2.length();
		
		//compare the both strings are equal
		if (length1==length2) {
			System.out.println("Length are equal");
			
		} else {
			System.out.println("Length are not equal");

		}
		//convert the string into character and store it in CharArray
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		//sort the character in ascending order
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		System.out.println(Arrays.toString(charArray1));
		System.out.println(Arrays.toString(charArray2));
		
		//check whether the two arrays are equal using boolean
		boolean equals = Arrays.equals(charArray1, charArray2);
		System.out.println(equals);
		
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given string is Anagram");
			
		}else {
			System.out.println("The given string is not Anagram");
		}
	}
}
