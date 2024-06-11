package classDemo;


import java.util.*;

public class LinkedlnHashMapDemo {
	
	public static void main(String str[])
	{
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		
		hm.put(0, "abc");
		hm.put(1, "def");
		hm.put(2, "ghe");
		
		System.out.println("HashMap value at 0 index: " +hm.get(0));
		
		//hm.remove(1);
		//System.out.println("HashMap value at 0 index: " +hm.get(1));
		
		//size:
		System.out.println("Size: " + hm.size());
		
		// Iterate the map using
        // for-each loop
        for (Map.Entry<Integer,String> e : hm.entrySet())
            System.out.println("Key: " + e.getKey()  + " Value: " + e.getValue());
		
        
	}

}