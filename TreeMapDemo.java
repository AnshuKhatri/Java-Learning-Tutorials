package classDemo;

import java.util.*;

public class TreeMapDemo {
	
	
	public static void main(String str[]) {
	TreeMap<Integer,String> tm=new TreeMap<>();
	
	tm.put(0, "abc");
	tm.put(22, "xhe");
	tm.put(190, "def");
	
	
	System.out.println("HashMap value at 0 index: " +tm.get(0));
	
	//hm.remove(1);
	//System.out.println("HashMap value at 0 index: " +hm.get(1));
	
	//size:
	System.out.println("Size: " + tm.size());
	
	// Iterate the map using
    // for-each loop
   // for (Map.Entry<Integer,String> e : tm.entrySet())
     //   System.out.println("Key: " + e.getKey()  + " Value: " + e.getValue());
    
    
    for(Integer i: tm.keySet())
    	System.out.println("Key: " + i + " Value: " + tm.get(i));
    

    for(String i: tm.values())
    	System.out.println(" " + i);
    	

}
}