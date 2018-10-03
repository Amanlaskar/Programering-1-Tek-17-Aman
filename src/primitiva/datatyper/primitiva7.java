package primitiva.datatyper;

import java.util.Scanner;

public class primitiva7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        System.out.print("Input a float number: ");
        float  x = in.nextFloat();  
        System.out.printf("The absolute value of %.2f is: %.2f",x, convert(x));
		System.out.printf("\n");
    }

    public static float convert(float n)
	{
		float absvalue = (n >= 0) ? n : -n;
		return absvalue;
	}
}