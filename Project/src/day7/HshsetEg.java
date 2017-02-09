package day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HshsetEg {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<>();
		
		s.add("Selenium");
		s.add("UFT");
		s.add("Manual");
		s.add("Apple");
		s.add("Apple");
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String course=it.next();
			System.out.println(course);
		}
	}

}
