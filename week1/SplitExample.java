package assignments.week1;

public class SplitExample {
	public static void main(String[] args) {
		
		//declare a string with a value
		String text = "Amazon has 200000 employees in chennai";
		
		//find the length of the string
		int length = text.length();
		System.out.println(text.length());
		
		//by replaceAll split the alphabets and get only number from the text string
		String replaceAll = text.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
		//using contains can check the word present in string
		Boolean contains=text.contains("Amazon");
		System.out.println(contains);
		
		//replace a word in the String and print
		String replaceAll1 = text.replaceAll("chennai", "Coimbatore");
		System.out.println(replaceAll1);
	}

}
