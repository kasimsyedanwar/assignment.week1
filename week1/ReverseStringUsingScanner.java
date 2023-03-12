package assignments.week1;

import java.util.Scanner;

public class ReverseStringUsingScanner {
		public static void main(String[] args) {
		    //declare a string variable using scanner class and get input from the user 
		    Scanner scan =new Scanner(System.in);
		    System.out.println("Enter your name");
	        String nextLine = scan.nextLine();
	      
	        //convert the string into character and store it in CharArray
			char[] character= nextLine.toCharArray();
			for(int i=character.length-1;i>=0;i--)
			{
				System.out.print(character[i]);
			}	
		}
	}




