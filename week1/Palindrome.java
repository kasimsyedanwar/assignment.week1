package assignments.week1;

public class Palindrome {
	public static void main(String[] args) {
		 //Declare the string as madam
		String text = "amma";
		//declare the empty string as rev
		String rev ="";
		//convert the string into character array
		char[] charArray = text.toCharArray();
		//iterate the loop using reverse for loop
		for (int i = charArray.length-1; i >=0; i--) {
			//store the iterating values in rev string
			rev = rev+charArray[i];
		}
			System.out.println(rev);
			
		
		//compare both string are equal
		if (text.equals(rev)) {
			//if it is match the given string is palindrome
			System.out.println(text + " is palindrome");
			
		}else {
			//if not the given string is not palindrome
			System.out.println(text + " is not a palindrome");
		}
	}
	}


