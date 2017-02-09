package javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		int[][] s=new int[2][3];

		//Finding the length of the rows
		
		System.out.println(s.length);
		
		//Finding the length of the columns
		
		System.out.println(s[0].length);
		
		//Writing the data into array
		
		s[0][1]=30000;
		s[1][2]=50000;
		
		//Reading the data from array
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
				
			}
		}
		
	}

}
