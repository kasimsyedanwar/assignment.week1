package assignments.week1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		//declare the string value as name
		String name = "kasim syed anwar";	
		//declare the string value to char array
		char[] charArray = name.toCharArray();
		//iterate the character form 0 to array length
		for (int i =0; i < charArray.length; i++) {
			if (i%2==1) {
				char oddIndex = Character.toUpperCase(charArray[i]);
				System.out.print(oddIndex);		
			}
			else {
				//print the character
				System.out.print(charArray[i]);
			}
		}	
	}

}
