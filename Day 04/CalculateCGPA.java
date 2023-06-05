package JavaDSA_Swapnil.com;

import java.util.Scanner;

public class CalculateCGPA {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks sub 1 :");
		double sub1=sc.nextDouble();
		
		System.out.println("Enter Marks Sub 2 :");
		double sub2=sc.nextDouble();
		
		System.out.println("Enter Marks Sub 3 :");
		double sub3=sc.nextDouble();
		
		System.out.println("Enter Marks Sub 4 :");
		double sub4=sc.nextDouble();
		
		double Total= sub1 + sub2 + sub3 + sub4;
		double percentage = Total / 4;
		double CGPA = percentage / 10;
		
		System.out.println("Percentage = "+ percentage);
		System.out.println("CGPA = "+ CGPA);

	}

}
