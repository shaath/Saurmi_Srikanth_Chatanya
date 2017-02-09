package javaprogrammes;

public class PolindromeEg {

	public static void main(String[] args) 
	{
		
		String course="Malayalam";
		String rev="";
		int len=course.length();
		
		for (int i = len-1; i >= 0; i--) 
		{
			rev=rev+course.charAt(i);
		}
				
		System.out.println(rev);
		if (course.equalsIgnoreCase(rev))
		{
			System.out.println("Given String is polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	}

}
