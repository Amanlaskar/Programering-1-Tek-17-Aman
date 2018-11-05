package functions;

import java.util.Scanner;

public class Uppgift2Funktioner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		averageAmongThree(input());
	}
	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.print("Input the first number:");
		inputs[0] = scanner.nextInt();
		System.out.print("Input the Second number:");
		inputs[1] = scanner.nextInt();
		System.out.print("Input the third number:");
		inputs[2] = scanner.nextInt();
		return inputs;
	}
	
	public static void averageAmongThree(int[] inputs) {
		
		
	}
	
}
	
