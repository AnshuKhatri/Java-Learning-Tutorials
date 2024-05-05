package classDemo;

import java.util.*;

public class VectorDemo {
	
	public static void main(String str[])
	{
		
		Vector<String> v=new Vector<>();
		
		
	   // Adding elements
		v.add("Ambala");
		v.add("Meerut");
		//v.addAll(v);
		
		System.out.println("Vector elements: "+ v);
	   // Updating elements
		v.set(0, null);
		System.out.println("Vector elements: "+ v);
	   // Removing elements
		v.remove(0);
		System.out.println("Vector elements: "+ v);
	   // Iterating over elements
		
		v.add("abc");
		v.add("xyz");
		
		for(String i:v)
			System.out.println("Vector elements: "+ i);
		
		
		Vector v2=new Vector();
		v2.add(v);
		v2.add(123);
		for(Object i:v2)
			System.out.print(i +"  " );
		
	}

}
