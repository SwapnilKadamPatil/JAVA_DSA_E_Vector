package String_Programs;

public class CompairToString {
	public static void main(String[] args) {
		
		String str1= "Progranmming";
		String str2= "Java Programming";
		String str3= "Progranmming";
		String str4= "Project Management";
		String str5= "Agile Methodology";
		
		System.out.println("Comparing String 1 to String 2 =" + str1.compareTo(str2));
		System.out.println("Comparing String 2 to String 3 =" + str2.compareTo(str3));
		System.out.println("Comparing String 1 to String 2 =" + str1.compareTo(str4));
		System.out.println("Comparing String 1 to String 2 =" + str1.compareTo(str5));
		
		
	}

}
/*
String’s compareTo method compares two String lexicographically. Both String get converted to unicode value and then compares.
If you call str1.compareTo(str2)

then if it returns
positive number : str1 is greater than str2

0: str1 is equal to str2
negative number : str1 is smaller than str2

 */