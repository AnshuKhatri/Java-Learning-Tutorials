package classDemo;

import java.util.*;

public class ArrayListDemo {
	
	public static void main (String str[]) {
	
	ArrayList ar=new ArrayList();
	
	//add the elements
	ar.add(111);
	ar.add(123);
	System.out.println("element ar: "+ ar.get(0));
	
	ArrayList a2=new ArrayList(ar);
	
	System.out.println("element a2: "+ a2);
	
	//setting the value
	a2.set(0, ar);
	System.out.println("element a2: "+ a2);
	
	//Removing elements/Delete element 
	
	a2.add("Test");
	//a2.remove("Test");
	
	System.out.println("element a2: "+ a2);
	
	//Iterating elements   
	
	//for(Integer i:a1) System.out.println(i); faces type mismatch: use generic value/ object
	
	for(int i=0;i<ar.size();i++)
		System.out.println("ArrayList " +i+":"+ar.get(i));
	
	//add elements in between two number
	
	ar.add(1, 1111);
    System.out.println("After insertion: " +ar);
    
    
	//Sorting elements
    
    Collections.sort(ar);
    
    System.out.println("After Sorting" +ar);
    
	//ArrayList size
	
	}
}
