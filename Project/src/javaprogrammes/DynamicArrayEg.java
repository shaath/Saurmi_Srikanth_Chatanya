package javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] s=new Object[5];
		
		//Finding the length of the array
		
		System.out.println(s.length);
		
		//Writing the data into an array
		s[0]="QEdge";
		s[2]=4000;
		s[1]="Selenium";
		s[2]="UFT";
		
		//Reading the data from an array
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			
		}
		

	}

}
