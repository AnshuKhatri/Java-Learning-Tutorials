package classDemo;

import java.util.*;

public class HashSetDemo {
	
	public static void main(String str[])
	{
		
		Set sobj=new HashSet();
		
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		//adding elements
		sobj.add(ar);
		sobj.add(1234);
		sobj.add(1234);
		
		System.out.println("HashSet: "+sobj);
		
		//removing element
		System.out.println("HashSet remove object: "+sobj.remove(1234) + " -->Set now: " + sobj);
		
		
		//iterating through
		
		for(Object o:sobj)
			System.out.println("HashSet: "+o);
		
		//Try new HashSet
		
		Set<ArrayList> sobj2=new HashSet<ArrayList>();
		sobj2.add(ar);
		System.out.println("HashSet Example2 : "+sobj2);
		
		/*
		 * If we are required to maintain the insertion order, then the LinkedHashSet will be useful. 
		 * But, when maintaining the insertion order of the elements is not our priority, the HashSet will be useful and provide improved performance
		 * */
		
	}

}
