package Java.com;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) 
	{
		int X;
		int Y;
		int Z;
		
		System.out.println(" Enter Three Numbers...");
		Scanner sc=new Scanner(System.in);
		
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		
		if (X>Y && X>Z)
		{
			System.out.println("First number is Largest .....");
			
		}
		else if(Y>X && Y > Z)
		{
			System.out.println("Second Number is Largest.... ");
		}
		else if (Z>X && Z>Y)
		{
			System.out.println("Third Number is Largest...");
		}
		else
		{
			System.out.println("Enter Valid Number....");
		}

	}

}
