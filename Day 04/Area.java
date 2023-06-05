package JavaDSA_Swapnil.com;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Base of triangle");
		int base=sc.nextInt();
		System.out.println("Enter the height of triangle.");
		int height=sc.nextInt();
		
		double AreaOfTriangle = 0.5 * base *  height;
		System.out.println("Area of Triangle = "+ AreaOfTriangle);
	}

}
