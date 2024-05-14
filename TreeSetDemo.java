package classDemo;

import java.util.*;

public class TreeSetDemo {
	
	public static void main(String str[])
	{
		
		SortedSet<Integer> ss=new TreeSet<>();
		ss.add(123);
		ss.add(111);
		
		System.out.println("TreeSet: "+ ss);
		
		
		System.out.println("TreeSet is empty: "+ ss.isEmpty());
		
		System.out.println("TreeSet is empty: "+ ss.first());  //sortedset feature
		
		System.out.println("TreeSet contains 123: "+ ss.contains(123));
		
		
	}

}
