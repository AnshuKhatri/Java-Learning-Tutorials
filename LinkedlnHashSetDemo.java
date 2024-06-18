package classDemo;

import java.util.*;

public class LinkedlnHashSetDemo {
	
	public static void main(String str[])
	{
		
		Set<String> sobj=new LinkedHashSet<>();
		
		sobj.add("Hello");
		sobj.add("Anshu");
		
		System.out.println("The LinkedHashSet Example: "+sobj);
		
		//update
		
		sobj.remove("Anshu");
		System.out.println("The LinkedHashSet Example: "+sobj);
		
		sobj.add("World");
		sobj.add("Lets Begin");
		
		Iterator<String> it= sobj.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterator: "+it.next());
			
		}
	}

}
