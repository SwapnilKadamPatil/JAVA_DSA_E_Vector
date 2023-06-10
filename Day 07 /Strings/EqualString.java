package String_Programs;

public class EqualString 
{
 public static void main(String[] args) {

	String str1="Hello World";
	 String str2="@Hello World";
	 String str3="Hello World";
	 
	 if (str1.equals(str2))
	 {
		 System.out.println("String 1 is equal to string 2");
		 
	 }
	 else
	 {
		 System.out.println("First and Second String are not equal");
		 
	 }
	 if(str1.equals(str3))
	 {
		 System.out.println("String 1 and String 3 are equals");
	 }
	 else
	 {
		 System.out.println("String 1 and String 3 are not equals");
	 }
	 
	 /*
	 
	 String str1 = "Hello world";
	  String str2 = new String("Hello world");
	  String str3 = "@Hello world";
	 
	  if (str1.equals(str2)) {
	   System.out.println("1st and 2nd Strings are equal");
	  } 
	  else {
	   System.out.println("1st and 2nd Strings are not equal");
	  }
	 
	  if (str1.equals(str3)) {
	   System.out.println("1st and 3rd Strings are equal");
	  } 
	  else {
	   System.out.println("1st and 3rd Strings are not equal");
	  }
	 */
}
}
