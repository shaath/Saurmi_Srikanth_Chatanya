package javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
//		int[] salary={20000,30000,4000,50000,60000};
		
		Object[] salary={"Selenium",4000,444.44,'M',true};

		//Finding the length of the array
		
		System.out.println(salary.length);
		
		//Reading the values from an array
		
//		System.out.println(salary[3]);
		
//		for (int i = 0; i < salary.length; i++) 
//		{
//			System.out.println(salary[i]);
//		}
		
		for (Object data : salary) 
		{
			System.out.println(data);
		}
		
	}

}
