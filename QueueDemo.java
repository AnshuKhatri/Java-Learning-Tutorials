package classDemo;

import java.util.*;

public class QueueDemo {
	
	public static void main(String str[])
	{
		
		Queue<Integer> q= new LinkedList<>();
		q.add(111);
		q.add(222);
		q.add(333);
		
		System.out.println("Queue first: "+q.peek());   //FIFO
		
		Iterator it= q.iterator();
		while(it.hasNext())
		{
			System.out.println(" " + it.next());
			
		}
		q.remove();
		System.out.println("Queue : "+q);
		
	}

}
