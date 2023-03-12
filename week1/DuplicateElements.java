package assignments.week1;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] num = {1,4,6,8,2,3,4,1,8};
		//1,4,8
		//iterate the value 0 to array length
		for (int i = 0; i < num.length; i++) {
			//add the inner loop, it starts with j=i+!
			for (int j = i+1; j < num.length; j++) {
                //check both array are equal
				if (num[i]==num[j]) {
				//if it is equal print duplicate number
					System.out.println(num[i]);
	}
			}
		}
	}
}


