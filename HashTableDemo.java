package classDemo;

import java.util.*;

public class HashTableDemo {
	
	public static void main(String str[]) {
		
		Hashtable<Integer,String> ht=new Hashtable<>();
		
		ht.put(0, "abc");
		ht.put(10, "fff");
		ht.put(110, "www");
		
		for(Map.Entry<Integer,String> ele: ht.entrySet())
			System.out.println(" " + ele.getKey());
		
		
	}

}
