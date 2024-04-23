package classDemo;

import java.util.*;

public class ArraySortDemo {
	
	public static void main(String str[])
	{
		
		Integer[] obj = new Integer[5];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<5;i++)
			obj[i]=sc.nextInt();
		
		//System.out.println("Integer array Length is: " + obj.length);
		
	   //sorting function call
		Arrays.sort(obj);
		
		for(Integer i: obj)
		System.out.println(" "+i);
		
		ArrayList<Integer> ar= new ArrayList<>();
		
		for(int i=0;i<5;i++)
			ar.add(sc.nextInt());
		
		Collections.sort(ar);
		
		for(Integer i: ar)
			System.out.println(" "+i);
		
		
		
		
	}

}
