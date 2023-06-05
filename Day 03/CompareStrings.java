package Java.com;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) 
	
	{
		String s1, s2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String First :");
		s1 = sc.nextLine();
		
		System.out.println("Enter Second String :");
		s2 = sc.nextLine();
		
		if (s1.compareTo(s2) > 0)
		{
			System.out.println("First String is greter than second String ");
			
		}
		else if (s1.compareTo(s2)<0)
		{
			System.out.println("Second String is gretar than first ");
		}
		else 
		{
			System.out.println("Both Strings Are Equal");
		}
	}

}
