package String_Programs;

public class isEmpty 
{
	public static void main(String[] args) 
	{
		String str1="";
		  String str2="java2blog";
		  String str3=null;
		 
		  System.out.println("str1 isEmpty: "+str1.isEmpty() );
		  System.out.println("str2 isEmpty: "+str2.isEmpty() );
		  
		  // str3.isEmpty will throw NullPointerException
		  System.out.println("str3 isEmpty: "+str3.isEmpty() );
	}
}
//String’s isEmpty method checks if length of string is 0 or not. It returns true if length of String is 0 else return false.

/*
 Output=
str1 isEmpty: true
str2 isEmpty: false

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "str3" is null
at String_Programs.isEmpty.main(isEmpty.java:14)
 */