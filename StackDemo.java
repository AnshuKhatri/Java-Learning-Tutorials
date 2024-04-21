package classDemo;


import java.util.*;
public class StackDemo {
	
	public static void main(String str[])
	{
		
		Stack<Integer> st = new Stack<>();
		
		st.push(11);
		st.push(123);
		
		System.out.println("Stack : " + st);
		
		System.out.println("Stack Top: "+ st.peek());
		
		st.pop();
		
		System.out.println("Stack : " + st);
		
		
		
	}

}
