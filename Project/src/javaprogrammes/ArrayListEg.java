package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		
		x.add("Selenium");
		x.add(30000);
		x.add(true);
		x.add(444.44);
		x.add(2, "QEdge");
		
		//Finding the length of the araylist
		
		System.out.println(x.size());
		
		//Reading the data from arraylist
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
		

	}

}
