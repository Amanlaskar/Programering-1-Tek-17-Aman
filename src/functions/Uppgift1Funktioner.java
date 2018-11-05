package functions;

import java.util.Scanner;

public class Uppgift1Funktioner {

	public static void main(String[] args) {
		averageAmongThree(input());
		averageAmongThree(input());
		
	}
	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.print("Input the first number:");
		System.out.print("Input the Second number:");
		System.out.print("Input the third number:");
		
		return inputs;
		
		
	}
	  public static double average(double x, double y, double z) {
		return 0;
	}
	
	public static void averageAmongThree(int[] inputs) {
		int tempVar; 
		if (inputs[0] < inputs[1]) {
			tempVar = inputs[0];
		} else {
			tempVar = inputs[1];
		}
		System.out.print("The average value is ");
		if (tempVar < inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
		}
	}


	
	


public static void averageAmongThree1 (int[] inputs) {
	int tempVar; 
	if (inputs[0] > inputs[1]) {
		tempVar = inputs[0];
	} else {
		tempVar = inputs[1];
	}
	System.out.print("The average value is ");
	if (tempVar > inputs[2]) {
		System.out.println(tempVar);
	} else {
		System.out.println(inputs[2]);
		
	}
}

private int x;
	
int w = x;

private int y;
int q = y;

private int z;
int e = z;
int res = (q + w + e)/3;
//System.out.println(res)
}
