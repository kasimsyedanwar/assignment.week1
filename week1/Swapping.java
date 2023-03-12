package assignments.week1;

public class Swapping {
	public static void main(String[] args) {
		//declare and initialize the variable
		int a = 5;
		int b = 20;
		
		//add the two values to assign 'a'
		a = a + b;
		//subtract 'a' and 'b' to store the value in 'b'
		b = a - b;
		//subtract 'a' and 'b' to store the value in 'a'
		
		a = a - b;
		
		//print the swapped values of 'a' and 'b'
		System.out.println("swapped values of a is "+a);
		System.out.println("swapped values of b is "+b);
	}
}
