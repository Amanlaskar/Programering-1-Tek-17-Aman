package arrays;
import java.util.Arrays;

public class arrayuppgift1 {

	public static void main(String[] args) {
		
		String[] toppings = new String[10];
		
		int[] intArray2 =  { 215, 548, 4547, 458, 67, 34, 324, 234, 21, 3 };

		Arrays.toString(intArray2);
		for (int index = 0; index < intArray2.length; index++) {
			System.out.println(intArray2[index]);
		}
		
	}
}
