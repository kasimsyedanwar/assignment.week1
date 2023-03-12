package assignments.week1;

public class Factorial {
	public static void main(String[] args) {
		//declare a variable in int and initialize the value to find the factorial
		int a = 5;
		//declare a new variable and store the value as 1
		int fact = 1;
		//find the factorial using for loop
		for (int i = a; i >=1; i--) {
			fact = fact*i;
		}
			System.out.println(fact);
		
	}

}
