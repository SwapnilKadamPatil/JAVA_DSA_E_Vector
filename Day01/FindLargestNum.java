package JavaDSA_Swapnil.com;

import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter 3 Numbers :");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		 
	/*	int a=10;
		int b=20;
		int c=30;
	*/	
		
		if(a > b && a > c)
		{
			int result = a;
			System.out.println("A is largest number of other two =" + result);
		}
		if(b > a && b > c)
		{
			int result = b;
			System.out.println("B is largest number of other two =" + result);
		}
		if(c > b && c > a)
		{
			int result =c;
			System.out.println("C is largest number of other two =" + result);
		}
		
		
	}

}
